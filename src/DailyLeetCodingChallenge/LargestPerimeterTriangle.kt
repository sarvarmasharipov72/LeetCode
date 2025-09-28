package DailyLeetCodingChallenge

import java.util.*
import kotlin.math.max

fun largestPerimeter(nums: IntArray): Int {
    Arrays.sort(nums)
    var maxP = 0
    for (i in 0 until nums.size - 2) {
        if (nums[i] + nums[i + 1] > nums[i + 2]) {
            maxP = max(maxP, nums[i] + nums[i + 1] + nums[i + 2])
        }
    }

    return maxP
}