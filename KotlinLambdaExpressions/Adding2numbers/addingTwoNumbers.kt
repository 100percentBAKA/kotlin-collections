fun main () {
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(10, 5))
}