fun main () {
    val firstList = mapOf("adarsh" to 95, "akash" to 88, "arun" to 39, "ani" to 32, "anu" to 93)

    var maximum = Int.MIN_VALUE
    var student : String = ""
    for(i in firstList.keys) {
        if(firstList[i]!! > maximum) {
            maximum = firstList[i]!!
            student = i
        }
    }

    println("Highest Marks of $maximum is obtained by $student ")
}