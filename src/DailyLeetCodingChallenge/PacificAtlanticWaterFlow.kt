package DailyLeetCodingChallenge

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {

    val ROW = heights.size
    val COL = heights[0].size
    val atl = Array(ROW){ BooleanArray(COL)}
    val pac = Array(ROW){ BooleanArray(COL)}

    fun dfs(r: Int,c: Int, visit: Array<BooleanArray>, prevHeight: Int) {
        if (r < 0 || c < 0 || r >= ROW || c >= COL) return
        if (visit[r][c] || heights[r][c] < prevHeight) return
        visit[r][c] = true
        dfs(r + 1, c, visit, heights[r][c])
        dfs(r - 1, c, visit, heights[r][c])
        dfs(r, c + 1, visit, heights[r][c])
        dfs(r, c - 1, visit, heights[r][c])
    }

    for (col in 0 until COL) {
        dfs(0, col, pac, heights[0][col])
        dfs(ROW - 1, col, atl, heights[ROW - 1][col])
    }
    for (row in 0 until ROW) {
        dfs(row, 0, pac, heights[row][0])
        dfs(row, COL - 1, atl, heights[row][COL - 1])
    }

    val result = mutableListOf<List<Int>>()
    for (row in 0 until ROW) {
        for (col in 0 until COL) {
            if (!(pac[row][col] && atl[row][col])) continue
            result.add(listOf(row,col))
        }
    }
    return result
}