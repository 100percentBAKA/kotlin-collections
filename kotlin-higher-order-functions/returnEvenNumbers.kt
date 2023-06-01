fun main () {
    val newList = listOf(1, 2, 3, 4, 5, 6, 7, 8) 

    // Using the filter()
    var modifiedNewList = newList.filter { it % 2 == 0 }
    println(modifiedNewList)

    modifiedNewList = newList.filter (::returnEven)
    println(modifiedNewList)
}

fun returnEven (number : Int) : Boolean {
    return number % 2 == 0
}