package array

import StockTrend
import kotlin.test.Test
import kotlin.test.assertEquals

class SellStockTests {
    @Test
    fun testMaxProfit() {
        outputShouldBe(7, intArrayOf(7, 1, 5, 3, 6, 4))
        outputShouldBe(4, intArrayOf(1, 2, 3, 4, 5))
        outputShouldBe(0, intArrayOf(7, 6, 4, 3, 1))
        outputShouldBe(4, intArrayOf(1, 3, 2, 4, 1))
        outputShouldBe(3, intArrayOf(2, 1, 4))
    }

    private fun outputShouldBe(expected: Int, prices: IntArray) {
        assertEquals(expected, StockTrend(prices).maxProfit());
    }
}