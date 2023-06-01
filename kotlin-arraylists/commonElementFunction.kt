// fun main () {
//     val primaryArr : ArrayList<Int> = arrayListOf(1, 2, 1, 3, 4, 2, 5, 6, 7)
//     val secondaryArr : ArrayList<Int> = arrayListOf(5, 6, 7)

//     val newSet : Set<Int> = commonElements(primaryArr, secondaryArr)
//     println(newSet)
// }

// fun commonElements(firstArr : ArrayList<Int>, secondArr : ArrayList<Int>) : Set<Int> {

//     return firstArr.toList() intersect secondArr.toList()
// }


fun main () {
    var primaryArr : ArrayList<Int> = arrayListOf(1, 5, 6, 7)
    var secondaryArr : ArrayList<Int> = arrayListOf(1, 2, 1, 3, 5, 6, 7)

    primaryArr = removeOccurringElement(primaryArr)
    secondaryArr = removeOccurringElement(secondaryArr)

    var newArrayList = commonElements(primaryArr, secondaryArr)

    println(newArrayList)
}

fun removeOccurringElement (arr : ArrayList<Int>) : ArrayList<Int> {

    for(i in arr.indices) {
        for(j in i + 1 until arr.size) {
            if(arr[i] == arr[j]) {
                arr.removeAt(j)
                break // the iteration inside the inner loop should not continue as the size of the array list changes after the element is removed
            }
        }
    }

    return arr
}

fun commonElements(firstArr : ArrayList<Int>, secondArr : ArrayList<Int>) : ArrayList<Int> {

    // var maxLength : Int = 0
    // if(firstArr.size > secondArr.size) maxLength = firstArr.size else maxLength = secondArr.size
    val newArr : ArrayList<Int> = ArrayList<Int> ()

    for(i in firstArr) {
        
        for(j in secondArr) {

            if(i == j) {
                newArr.add(i)
            }
        }
    }

    return newArr
}
