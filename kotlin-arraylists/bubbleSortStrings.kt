fun main () {
    var arr : ArrayList<String> = arrayListOf("Akash", "Adarsh", "Arun", "Bharat")
    println(arr)
    
    // Implementing the Bubble Sort Logic 
    for(i in arr.indices) {
        for(j in 0 until (arr.size - (i + 1))) {
                if(arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
        }
    }

    println(arr) // Implicit Call to toString()

}