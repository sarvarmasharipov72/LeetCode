package Arrays

import kotlin.math.min

fun minimumTotal(triangle: List<List<Int>>): Int {
    if (triangle.size == 1) return triangle[0][0]
    val sumList: MutableList<Int> = mutableListOf()
    for (i in triangle[triangle.size - 1].indices) {
        sumList.add(triangle[triangle.size - 1][i])
    }
    for (i: Int in (triangle.size - 2)downTo 0) {
        for (j: Int in triangle[i].indices) {
            sumList[j] = min(sumList[j], sumList[j + 1]) + triangle[i][j]
        }
    }
    return sumList[0]
}