fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val addition = calculate(5, 3) { x, y -> x + y }
    println("Addition: $addition") 
    
    val subtraction = calculate(10, 4) { x, y -> x - y }
    println("Subtraction: $subtraction") 
    
    val multiplication = calculate(6, 2) { x, y -> x * y }
    println("Multiplication: $multiplication") 
}
