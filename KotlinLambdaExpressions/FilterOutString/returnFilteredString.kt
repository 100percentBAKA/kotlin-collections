fun main () {
    val newList = listOf("arun", "Adarsh", "ani", "anu", "kiran", "hemanth")

    val modifiedNewList = newList.filter { !it.equals("ani") }
    println(modifiedNewList)

    val sum : (Int, Int) -> Int = { a, b -> a + b }
    println(sum(10, 2))
}