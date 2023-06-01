fun main () {
    val stringList = listOf("mango", "watermelon", "apple", "pear", "papaya")
    val modifiedStringList = stringList.sortedByDescending { it.length }

    println(modifiedStringList)
}