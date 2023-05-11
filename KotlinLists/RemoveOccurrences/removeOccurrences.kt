fun main () {
    val newList : MutableList<Int> = mutableListOf(1, 2, 3, 1, 4, 5, 2, 7, 4)

    for(i in newList.indices) {
        for(j in i + 1 until newList.size) {

            if(newList[i] == newList[j]) {
                newList.removeAt(j)
                break
                // break statement is important, the size of the list changes when element is removed
                // When the inner loop is iterated once again, since the size is changed
                // Might lead to OutOfBoundException
            }
        }
    }

    println("Elements of the List after removal of duplicate elements are:\n$newList")
}

// using the distinct()

// fun main () {
//     var newList : MutableList<Int> = mutableListOf(1, 2, 3, 1, 3, 2, 5 , 6, 7, 3 ,4 ,5)

//     // Distinct() returns a immutable list
//     newList = newList.distinct().toMutableList()
//     newList.sort() // doesn't return anything, just modifies the pre-existing list

//     newList.forEach { print("$it, ") }
// }