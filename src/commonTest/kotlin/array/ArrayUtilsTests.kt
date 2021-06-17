package array

import kotlin.test.Test
import kotlin.test.assertTrue

class ArrayUtilsTests {

    @Test
    fun testDuplicatedRemoving() {
        arrayShouldBe(intArrayOf(1), intArrayOf(1))
        arrayShouldBe(intArrayOf(1, 2, 3, 4), intArrayOf(1, 2, 3, 3, 4))
        arrayShouldBe(intArrayOf(1, 2, 4, 5), intArrayOf(1, 2, 2, 4, 5, 5, 5))
    }

    private fun arrayShouldBe(expected: IntArray, nums: IntArray) {
        val size = ArrayUtils().removeDuplicates(nums)
        assertTrue { expected contentEquals nums.slice(0 until size).toIntArray() }
    }
}