package DailyLeetCodingChallenge

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun trapRainWater(heightMap: Array<IntArray>): Int {
    var sum = 0
    val m = heightMap.size
    val n = heightMap[0].size
    val waterLevel = initWaterLevel(heightMap)
    while (true) {
        var hasChanged = false
        for (i in 1 until m - 1) {
            for (j in 1 until n - 1) {
                val oldValue = waterLevel[i][j]
                waterLevel[i][j] = max(
                    heightMap[i][j], min(waterLevel[i][j], min(waterLevel[i - 1][j], waterLevel[i][j - 1]))
                )
                if (oldValue != waterLevel[i][j]) hasChanged = true
            }
        }
        if (!hasChanged) break
        hasChanged = false
        for (i in (m - 2) downTo 1) {
            for (j in (n - 2) downTo 1) {
                val oldValue = waterLevel[i][j]
                waterLevel[i][j] = max(
                    heightMap[i][j], min(waterLevel[i][j], min(waterLevel[i + 1][j], waterLevel[i][j + 1]))
                )
                if (oldValue != waterLevel[i][j]) hasChanged = true
            }
        }
        if (!hasChanged) break
    }
    for (i in 1 until m - 1) {
        for (j in 1 until n - 1) {
            sum += waterLevel[i][j] - heightMap[i][j]
        }
    }
    return sum
}

fun initWaterLevel(heightWater: Array<IntArray>): Array<IntArray> {
    val n = heightWater[0].size
    val m = heightWater.size
    val waterLevel: Array<IntArray> = Array(heightWater.size) { IntArray(heightWater[0].size) }
    for (i in heightWater.indices) {
        Arrays.fill(waterLevel[i], Int.MAX_VALUE)
    }

    for (i in heightWater.indices) {
        waterLevel[i][0] = heightWater[i][0]
        waterLevel[i][n - 1] = heightWater[i][n - 1]
    }

    for (i in heightWater[0].indices) {
        waterLevel[0][i] = heightWater[0][i]
        waterLevel[m - 1][i] = heightWater[m - 1][i]
    }
    return waterLevel
}