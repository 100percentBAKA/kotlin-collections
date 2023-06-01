fun main () {
    val arr : ArrayList<String> = ArrayList<String> () // declaring an empty array list
    arr.add("Adarsh")
    arr.add("Akash")
    arr.add("Ani")
    arr.add("Anu")
    arr.add("Watermelon")
    arr.add("orange")

    println("String having length more than 5")
    for(i in arr) {
        if(i.length > 5) {
            print("$i ")
        }
    }
}