import algorithms.binary.BinarySearch
import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {
    private val testObject: BinarySearch = BinarySearch()

    @Test
    fun correctSearchTest() {
        val array = intArrayOf(0, 1, 2, 4, 5, 6, 7)
        val target = 4

        val result = testObject.search(array, target)
        assertEquals(3, result)
    }

    @Test
    fun incorrectSearchTest() {
        val array = intArrayOf(0, 1, 2, 4, 5, 6, 7)
        val target = 9

        val result = testObject.search(array, target)
        assertEquals(-1, result)
    }
}