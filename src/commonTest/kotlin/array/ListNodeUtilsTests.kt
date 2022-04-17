package array

import linkedList.ListNode
import linkedList.ListNodeUtils
import org.junit.Test
import kotlin.test.assertEquals

class ListNodeUtilsTests {
    @Test
    fun testRevert() {
        val node4 = ListNode(4)
        val node3 = ListNode(3)
        node3.next = node4
        val node2 = ListNode(2)
        node2.next = node3
        val node1 = ListNode(1)
        node1.next = node2

        val node = ListNodeUtils().reverseList(node1);
        assertEquals(4, node!!.`val`)
        assertEquals(3, node!!.next!!.`val`)
        assertEquals(2, node!!.next!!.next!!.`val`)
        assertEquals(1, node!!.next!!.next!!.next!!.`val`)
        assertEquals(null, node!!.next!!.next!!.next!!.next)
    }
}