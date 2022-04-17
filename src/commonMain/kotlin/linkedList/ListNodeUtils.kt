package linkedList

class ListNodeUtils {
    fun deleteNode(node: ListNode?) {
        if (node != null) {
            node.`val` = node.next!!.`val`
            node.next = node.next!!.next
        }
    }

    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) {
            return head
        }

        val nodePair = reverse(head)
        head.next = null
        return nodePair.first
    }

    fun reverseList2(head: ListNode?): ListNode? {
        if(head == null) {
            return head
        }

        var currentNode = head
        var result: ListNode? = ListNode(head.`val`)
        while ( currentNode!!.next != null) {
            val newNode = ListNode(currentNode.next!!.`val`)
            newNode.next = result
            currentNode = currentNode.next
            result = newNode
        }
        return result
    }

    fun reverse(node: ListNode): Pair<ListNode?, ListNode?> {
        if (node.next == null) {
            return Pair(node, node)
        } else {
            val nodePair = reverse(node.next!!)
            nodePair.second!!.next = node
            return Pair(nodePair.first, node)
        }
    }
}