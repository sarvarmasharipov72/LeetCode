package DailyLeetCodingChallenge

import kotlin.math.min

fun minScoreTriangulation(values: IntArray): Int {
    val cache = Array(values.size) {IntArray(values.size){ -1 } }

    fun dp(l: Int, r: Int): Int {
        if (r - l < 2) {
            return 0
        }
        if (cache[l][r] != -1) {
            return cache[l][r]
        }
        var ans = Int.MAX_VALUE
        for (i in l+1 until r) {
            val t = dp(l, i) + dp(i, r) + values[l] * values[r] * values[i]
            ans = min(ans, t)
        }
        cache[l][r] = ans
        return ans
    }
    return dp(0, values.size - 1)
}