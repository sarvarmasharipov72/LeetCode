package Strings

fun wordsPattern(pattern: String, s: String): Boolean {
    val splitWords: List<String> = s.split(" ")
    if (splitWords.size != pattern.length) return false
    val map = HashMap<Char, String>()
    for (i: Int in pattern.indices) {
        if (map.getOrPut(pattern[i]) { splitWords[i] } != splitWords[i]) return false
    }
    if (map.values.toSet().size != map.size) return false
    return true
}