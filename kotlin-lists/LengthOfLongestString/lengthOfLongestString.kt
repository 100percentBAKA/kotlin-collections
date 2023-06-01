fun main () {

    val newList : List<String> = listOf("arun", "adarsh", "akash", "ani", "anu")

    var string : String = ""
    var longest : Int = 0
    // val longest : Int = Int.MIN_VALUE
    // there is no point in setting longest to MIN_VALUE as length of a string can never be negative

    for(i in newList) {
        if(i.length > longest) {

            longest = i.length
            string = i
        }
    }

    println("Longest String is $string of length $longest")
}