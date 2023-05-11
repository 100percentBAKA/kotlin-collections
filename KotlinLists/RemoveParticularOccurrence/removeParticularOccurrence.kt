fun main () {
    val newList : MutableList <Int> = mutableListOf(1, 2, 3, 1, 2, 4, 3, 2, 5, 6, 7)
    val elementToRemove : Int = 2

    val finalList = listOf(elementToRemove)
    // val finalList = listOf(2)
    newList.removeAll(finalList)
    newList.sort()

    newList.forEach { print("$it, ") }
}