fun main () {
    var arr : ArrayList <String> = arrayListOf("adarsh", "brian", "car",  "mango", "watermelon")
    arr = convertToUpperCase(arr)

    println(arr)
}

fun convertToUpperCase(arr : ArrayList <String>) : ArrayList <String> {

    for(i in arr.indices) {
        arr[i] = arr[i].uppercase()
    }
    
    return arr
}
