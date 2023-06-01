fun main () {
    val firstList = listOf(1, 2, 3, 4, 7, 9)
    val modifiedFirstList = firstList.map { a : Int -> a * a }
    // val modifiedFirstList = firstList.map { it * it }

    println("Sum of all the squares: \n${modifiedFirstList.sum()}")
}