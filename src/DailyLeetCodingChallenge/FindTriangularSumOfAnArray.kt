package DailyLeetCodingChallenge

fun triangularSum(nums: IntArray): Int {

    for (i in 0..nums.size - 2) {
        for (j in 0 until (nums.size - i - 1)) {
            nums[j] = (nums[j] + nums[j + 1])%10
        }
    }
    return nums[0]
}