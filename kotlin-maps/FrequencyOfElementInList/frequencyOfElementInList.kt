fun main () {
    val firstList = listOf(1, 2, 3, 1, 4, 5, 2, 3, 7, 6, 8)

    // creating a mutable empty map
    val modifiedMap : MutableMap<Int, Int> = mutableMapOf()

    for(i in firstList) {

        if(modifiedMap.containsKey(i)) {

            var frequency :Int? = modifiedMap.get(i)
            frequency = frequency?.plus(1)
            modifiedMap.put(i, frequency!!) // asserting the compiler that the frequency is not null 
        }
        else {
            modifiedMap.put(i, 1)
        }
    }

    for(i in modifiedMap.keys) {
        println("$i : ${modifiedMap[i]}")
    }
}