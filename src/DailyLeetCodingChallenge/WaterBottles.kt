package DailyLeetCodingChallenge

fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
    var n = numBottles
    var cnt = numBottles
    while (n >= numExchange) {
        cnt += n/numExchange
        n = n - (n/numExchange) * numExchange + n/numExchange
    }
    return cnt
}