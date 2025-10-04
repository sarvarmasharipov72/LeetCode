package DailyLeetCodingChallenge

import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var maxSum = 0
    var l = 0
    var r = height.size - 1
    while (r > l) {
        maxSum = max(maxSum, min(height[r], height[l]) *  (r - l))
        if (height[r] > height[l]) l++
        else r--
    }
    return maxSum
}