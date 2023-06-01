fun main () {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(4, 5, 6, 7, 8)

    val map1 = array1.toSet().associateWith { true }
    val commonElements = mutableListOf<Int>()

    for (num in array2) {
        if (map1.containsKey(num)) {
            commonElements.add(num)
        }
    }

    println("Common elements: $commonElements")
}