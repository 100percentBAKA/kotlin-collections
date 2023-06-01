// Write a Kotlin program to find the index of the first occurrence of a given element in an ArrayList.
fun main () {
    val arr : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 1, 3)
    val element : Int = 3

    // Implementation using binary search
    arr.sort()

    val index = arr.binarySearch(element)

    if(index >= 0) {

        var result = upperBound(arr, index, element)

        if(result != -1) {
            println("Upper Bound of $element is att the index $result")
        }
        else {
            println("$element is found at the index $index")
        }

        result = lowerBound(arr, index, element)

        if(result != -1) {
            println("Lower Bound of $element is at the index $result")
        }
        else {
            println("$element is found at the index x$index")
        }
    }
    else {
        println("Element not found")
    }
}

fun upperBound(arr : ArrayList<Int>, index : Int, element : Int) : Int {
    var mid = index

    while(mid < arr.size) {
        if(arr[++mid] == element)
            return mid
        
        mid++  
    }

    return -1
}

fun lowerBound(arr : ArrayList<Int>, index : Int, element : Int) : Int {
    var mid = index

    while(mid >= 0) {
        if(arr[--mid] == element)
            return mid
        
        mid++  
    }

    return -1
}