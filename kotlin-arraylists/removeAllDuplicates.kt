// fun main () {
//     var arr : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 1, 2, 6, 4, 3, 2, 7) // Declaring an Empty ArrayList
//     var modifiedArr : List<Int> = arr.distinct() // distinct() returns a List

//     println(modifiedArr)
// }

fun main () {
    var arr : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 1, 2, 6, 4, 3, 2, 7) // Declaring an Empty ArrayList

    for(i in arr.indices) {
        for(j in i + 1 until arr.size) {
            if(arr[i] == arr[j]) {
                arr.removeAt(j)
                break // the iteration inside the inner loop should not continue as the size of the array list changes after the element is removed
            }
        }
    }

    println(arr)
}