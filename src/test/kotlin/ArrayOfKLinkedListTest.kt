import algorithms.ArrayOfKLinkedList
import java.util.*
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ArrayOfKLinkedListTest {

    private val arrayOfKLinkedList : ArrayOfKLinkedList = ArrayOfKLinkedList()

    @Test
    fun testThreeLinkedLists() {
        val list1 = LinkedList<Int>()
        list1.addAll(listOf(1, 4, 5))
        val list2 = LinkedList<Int>()
        list2.addAll(listOf(1, 3, 4))
        val list3 = LinkedList<Int>()
        list3.addAll(listOf(2, 6))
        val input = arrayOf(list1, list2, list3)

        val correctResult = "1, 1, 2, 3, 4, 4, 5, 6"
        val result = arrayOfKLinkedList.mergeKLists(input)

        assertEquals(correctResult, result.joinToString())
    }

    @Test
    fun testEmptyArray() {
        val input = emptyArray<LinkedList<Int>>()
        val result = arrayOfKLinkedList.mergeKLists(input)
        assert(result.isEmpty())
    }

    @Test
    fun testSoloLinkedList(){
        val list1 = LinkedList<Int>()
        list1.addAll(listOf(1, 4, 5))

        val input = arrayOf(list1)

        val correctResult = "1, 4, 5"
        val result = arrayOfKLinkedList.mergeKLists(input)

        assertEquals(correctResult, result.joinToString())
    }

    @Test
    fun testTwoLinkedList(){
        val list1 = LinkedList<Int>()
        list1.addAll(listOf(1, 4, 5))
        val list2 = LinkedList<Int>()
        list2.addAll(listOf(2, 6))

        val input = arrayOf(list1, list2)

        val correctResult = "1, 2, 4, 5, 6"
        val result = arrayOfKLinkedList.mergeKLists(input)

        assertEquals(correctResult, result.joinToString())
    }
}