fun main () {

    val primaryArr = arrayOf(1, 2, 3, 4, 5, 2, 1)
    val secondaryArr = arrayOf(7, 6, 2)

    val primarySet = primaryArr.toSortedSet()
    val secondarySet = secondaryArr.toSortedSet()

    println("Common Elements between Primary and Secondary Arr: ${primarySet intersect secondarySet}") // intereset returns a new list containing common elements b/w the two sets
    println("Uncommon Elements between Primary and Secondary Arr: ${primarySet subtract secondarySet}") // subtract returns a new list containing uncommon elements b/w the two sets
}