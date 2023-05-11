fun main () {
    val firstList : MutableList<String> = mutableListOf("Adarsh", "Akash", "Arun", "Anu")
    val secondList : List<String> = listOf("one", "two", "three")

    firstList.addAll(secondList)
    println("Merged List contents are:\n$firstList")
}