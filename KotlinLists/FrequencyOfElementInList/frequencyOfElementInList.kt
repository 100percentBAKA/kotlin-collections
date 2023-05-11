fun main () {
    var primaryList : List<Int> = mutableListOf(1, 1, 2, 3, 4, 5, 1, 2)
    // the list has to be of type mutable to be sorted, immutable lists cannot be sorted 
    primaryList = primaryList.sorted()

    // Initializing an empty array to store the frequency of elements occuring in the list
    val arr : Array<Int> = Array(primaryList[primaryList.size - 1] + 1) { 0 }

    for(i in primaryList.indices) {
        arr[primaryList[i]] += 1
    }

    // printing the frequencies of the elements

    for(i in arr.indices) {
        println("$i : ${arr[i]}")
    }
}
