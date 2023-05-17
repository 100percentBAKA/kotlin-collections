fun main () {
    val newList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    // Using the Lambda Expression
    var modifiedList = newList.filter { a : Int -> a % 4 == 0 }
    println(modifiedList)

    // Using the 'it' Keyword
    modifiedList = newList.filter { it % 4 == 0 }
    println(modifiedList)

    // Using the function call operator
    modifiedList = newList.filter(::multipleOfFour)
    println(modifiedList)

    /*
     * In Kotlin, the :: symbol is used to reference functions or properties without invoking them. 
     * It allows you to pass functions as arguments, store them in variables, or use them in various functional programming scenarios.
    */

    modifiedList = newList.filter(fun (number : Int) : Boolean {
        return number % 4 == 0
    })
    println(modifiedList)

}

fun multipleOfFour(number : Int) : Boolean {
    return number % 4 == 0
} 