import algorithms.binary.RotatedSortedArray
import kotlin.test.Test
import kotlin.test.assertEquals

class RotatedSortedArrayTest {
    private val testObject: RotatedSortedArray = RotatedSortedArray()

    @Test
    fun findTargetInArray() {
        val array = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 6
        val result = testObject.search(array, target)

        assertEquals( 2, result)
    }

    @Test
    fun findNumbNotFromArrayInArray() {
        val array = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val target = 3
        val result = testObject.search(array, target)

        assertEquals( -1, result)
    }
}