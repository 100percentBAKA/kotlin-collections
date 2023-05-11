fun main () {
    val oldMap = mutableMapOf(1 to "apple", 2 to "kotlin", 3 to "java", 4 to "flutter", 5 to "Scala")
    val filteredMap = oldMap.filter { (key, value) -> key >= 3 && value.endsWith("a") }.toMutableMap()

    println(filteredMap)

    val newFilteredMapKeys = oldMap.filterKeys { it >= 3 } // return a new map
    println(newFilteredMapKeys)

    val newFilteredMapValues = oldMap.filterValues { it.endsWith("a") }
    println(newFilteredMapValues)
}