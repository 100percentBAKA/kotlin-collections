fun main () {
    val arr : ArrayList<Int> = ArrayList<Int>() 

    var sum : Int = 0
    var temp : Int = 0
    for(i in 1..5) {
        arr.add(i)
        sum += arr.elementAt(temp++)
    }

    println(arr.sum())
    // println(sum)
    
}