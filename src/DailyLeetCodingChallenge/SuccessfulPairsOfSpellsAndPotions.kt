package DailyLeetCodingChallenge

import java.util.*

fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
    val result = IntArray(spells.size)
    val pL = potions.size
    Arrays.sort(potions)
    for (i in spells.indices) {
        var right = pL - 1
        var left = 0
        while (right >= left) {
            val mid = left + (right - left) / 2
            if ((spells[i].toLong() * potions[mid]) >= success) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        result[i] = pL - left
    }
    return result
}