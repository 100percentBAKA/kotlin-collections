fun main () {
    val arr : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    val newArr : ArrayList<Int> = ArrayList<Int> ()

    println(arr)

    // for(i in arr.size - 1 downTo 0) {
    //     println(arr[i])
    // }


    // var temp : Int = 0

    // for(i in arr.size - 1 downTo 0) {
    //     newArr[temp++] = arr[i]
    // }

    // In Kotlin, when you create an ArrayList, it doesn't automatically allocate memory for elements like an array does. 
    // So, you cannot assign values to specific indices of an ArrayList using the index operator.

    for(i in arr.size - 1 downTo 0) {
        newArr.add(arr[i])
    }

    println(newArr)
}