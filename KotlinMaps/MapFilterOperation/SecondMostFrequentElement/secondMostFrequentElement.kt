fun main () {
    val arr = arrayOf(1, 2, 3, 1, 2, 3, 2, 5, 6, 3)

    val modifiedMap : MutableMap<Int, Int> = mutableMapOf()

    for(i in arr) {
        if(modifiedMap.containsKey(i)) {
            var frequency : Int? = modifiedMap[i] // map can contain null values, should use the concept of nullables
            frequency = frequency?.plus(1)
            modifiedMap[i] =
                frequency!! // !! tells the compiler that the frequency will not be null during run-time even tho the frequency variable is declared as a nullable
        }
        else {
            modifiedMap[i] = 1
        }
    }

    var secondMax : Int = Int.MIN_VALUE
    var max : Int = Int.MIN_VALUE

    var element : Int = 0
    var secondElement : Int = 0

    println(modifiedMap)

    for(i in modifiedMap.keys){
        if(modifiedMap[i]!! > max) {
            secondMax = max
            max = modifiedMap[i]!! // modifiedMap[i] will not be Null during run-time
            secondElement = element
            element = i
        }
        else if(secondMax < modifiedMap[i]!! && max != modifiedMap[i]!!) {
            secondMax = modifiedMap[i]!!
            secondElement = i
        }
    }

//    var maxFrequency: Int = Int.MIN_VALUE
//    var secondMaxFrequency: Int = Int.MIN_VALUE
//    var maxElement: Int = 0
//    var secondMaxElement: Int = 0
//
//    for ((key, value) in modifiedMap) {
//        if (value > maxFrequency) {
//            secondMaxFrequency = maxFrequency
//            secondMaxElement = maxElement
//            maxFrequency = value
//            maxElement = key
//        } else if (value > secondMaxFrequency && value != maxFrequency) {
//            secondMaxFrequency = value
//            secondMaxElement = key
//        }
//    }

    println("$secondElement has occurred $secondMax times")

}