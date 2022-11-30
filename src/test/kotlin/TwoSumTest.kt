import algorithms.hash.TwoSum
import kotlin.test.Test
import kotlin.test.assertTrue

class TwoSumTest {
    private var testObject: TwoSum = TwoSum()

    @Test
    fun correctTest() {
        var testArr = intArrayOf(2, 8, 41, 3, 11, 7, 15)
        val target = 9
        val result = testObject.twoSum(testArr, target)
        assertTrue(result.isNotEmpty())
        assertTrue(result.size == 2)
        assertTrue(result.contains(0) && result.contains(5))
    }
}