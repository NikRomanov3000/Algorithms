import java.util.*

fun main(args: Array<String>) {
    val list1 = LinkedList<Int>()
    list1.addAll(listOf(1, 4, 5))
    val list2 = LinkedList<Int>()
    list2.addAll(listOf(1, 3, 4))
    val list3 = LinkedList<Int>()
    list3.addAll(listOf(2, 6))
    val emptyList = LinkedList<Int>()

    //emptyArray<LinkedList<Int>>()
    val input = arrayOf(list1, list2, list3)

    //val result = mergeKLists(input)

    println("Program arguments: ${args.joinToString()}")
}