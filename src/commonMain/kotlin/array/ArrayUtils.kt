package array

class ArrayUtils {
    fun removeDuplicates(sortedNums: IntArray): Int {
        var distinctCount = 1;
        for (i in 1 until sortedNums.size) {
            if (sortedNums[distinctCount - 1] >= sortedNums[distinctCount]) {
                moveToLast(distinctCount, sortedNums)
            } else {
                distinctCount++
            }
        }
        return distinctCount
    }

    private fun moveToLast(from: Int, nums: IntArray) {
        for (index in from until nums.size - 1) {
            val tmp = nums[index]
            nums[index] = nums[index + 1]
            nums[index + 1] = tmp
        }
    }
}