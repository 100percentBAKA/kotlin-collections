//fun main () {
//    val firstList = mutableListOf(1, 2, 3, 1, 2, 5, 6, 7, 11, 12, 23, 44, 56)
//    firstList.sort() // sort in Ascending Order
//    val secondList : List<Int> = firstList.distinct()
//
//    println("Second Largest Element is ${secondList[secondList.size - 2]}")
//}

fun main () {
    // Immutable List, use toMutableList() if the list has to be altered or if new elements are to be added
    val firstList = listOf(1, 2, 12, 34, 2, 12, 4, 5, 6, 23)

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for(i in firstList.indices) {
        if(firstList[i] > max) {
            secondMax = max
            max = firstList[i]
        }
        else if ( secondMax < firstList[i] && firstList[i] != max) {
            secondMax = firstList[i]
        }
    }
    println("Max Element in the list is : $max")
    println("Second Max Element in the list is: $secondMax")
}