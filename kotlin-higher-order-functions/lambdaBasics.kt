fun main () {

    // val sum = {x : Int -> x * x}
    // println(sum(10))
    // Above is the Example for single line lambda expression

    
    val sum : (Int) -> Int = {x -> x * x}
    println(sum(10))
    // Above is an Example for single line Lambda Expression where the function type is defined

    val example = {
        println("This is an example for multi line lambda expression !!")
        println(1+1)
        "Return Type is String !!" // The last line of a multi line lambda expression is usually its return type
    }
    // example()
    println(example())

    val printHi = {name: String -> println("$name says HI !!")}
    printHi("Adarsh")

    println(printHi("Adarsh"))
    // The above line of code prints the return type of the lambda expression which is *unit*

    val singleParam = {x : Int -> x + x}
    // The above line of code can be modified using the 'it' keyword 
    // In kotlin Lambda Expressions, the keyword 'it' is an implicit name which refers to the single parameter when a lambda has only one parameter
    val modifiedSingleParam : (Int) -> Int = {it + it}

    println(singleParam(10))
    println(modifiedSingleParam(10))
}