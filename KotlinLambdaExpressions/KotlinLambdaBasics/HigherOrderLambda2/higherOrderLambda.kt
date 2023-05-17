fun main () {
    val newList = listOf(
        Student(11, "ADARSH"),
        Student(12, "ARUN"),
        Student(13, "KIRAN"),
        Student(14, "HEMANTH")
    )

    var modifiedList = newList.filter { !it.name.equals("ARUN") }
    println(modifiedList)

    modifiedList = newList.filter(::eliminateStudent)
    println(modifiedList)

    // map() in List<> In Kotlin, the map method is a higher-order function available on lists and other collections. 
    // It applies a transformation function to each element of the list and returns a new list containing the transformed elements. The original list remains unchanged.
    val primaryList = listOf(1, 2, 3, 4, 5, 6, 2)
    val modifiedPrimaryList = primaryList.map { it * it }
    println("Modified Primary List:\n$modifiedPrimaryList")

    val modifiedStudentList = newList.map { placement(it.id, it.name, true)}
    println(modifiedStudentList)
}

data class Student (var id : Int, var name : String)
data class placement (var id : Int, var name : String, var placed : Boolean)

fun eliminateStudent (student : Student) : Boolean {
    return !student.name.equals("ARUN")
}