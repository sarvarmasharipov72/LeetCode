package DailyLeetCodingChallenge

fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
    var isFirst = true
    var cnt = 1
    for (i in 1 until nums.size) {
        if (nums[i] > nums[i - 1]) {
            cnt++
        } else if (cnt < k) {
            cnt = 1
            isFirst = true
        } else if (isFirst && cnt < 2 * k) {
            isFirst = false
            cnt = 1
        } else {
            return true
        }
    }
    return cnt >= 2 * k || isFirst && cnt >= k
}