package DailyLeetCodingChallenge

import kotlin.math.max

fun minTime(skill: IntArray, mana: IntArray): Long {
    val timeArray = LongArray(skill.size) { 0 }
    for (i in mana.indices) {
        var currentTime: Long = 0
        for (j in skill.indices) {
            currentTime = max(currentTime, timeArray[j]) + skill[j] * mana[i]
        }
        timeArray[skill.size - 1] = currentTime
        for (j in skill.size - 2 downTo 0) {
            timeArray[j] = timeArray[j + 1] - skill[j + 1] * mana[i]
        }
    }
    return timeArray.last()
}