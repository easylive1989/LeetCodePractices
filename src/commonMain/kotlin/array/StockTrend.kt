class StockTrend(private val prices: IntArray) {

    fun maxProfit(): Int {
        if (prices.size == 1) return 0

        var profit = 0
        var buyStockIndex: Int = -1
        for (index in 0 until prices.size - 1) {
            if (buyStockIndex != -1 && prices[index] > prices[index + 1]) {
                profit += prices[index] - prices[buyStockIndex]
                buyStockIndex = -1
            }

            if (buyStockIndex == -1) {
                if (prices[index] < prices[index + 1]) {
                    buyStockIndex = index
                }
            }

            if (index >= prices.size - 2 && buyStockIndex != -1) {
                if (prices[index] <= prices[index + 1]) {
                    profit += prices[index + 1] - prices[buyStockIndex]
                }
            }
        }

        return profit
    }
}