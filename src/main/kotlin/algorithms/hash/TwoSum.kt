package algorithms.hash

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 *
 * @see https://leetcode.com/problems/two-sum/
 */
class TwoSum {
    /**
     * Идея алгоритма: a + b = target -> a = target - b
     * затем, проверяем, нашли ли мы a (где a = target - b) в прошлом
     * Если a существет в mapOfSeen то мы нашли a и b, где a + b = target
     * В ином случае добавляем  b в просмотренные
     *
     * Time: O(N), where N is number of elements in the array nums.
     * Space: O(N)
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Key - значение, Value - индекс
        var mapOfSeen = HashMap<Int, Int>()

        for (i in 0 until nums.size) {
            var b = nums[i]
            var a = target - b
            if(mapOfSeen.containsKey(a)) {
                return intArrayOf(mapOfSeen.get(a)!!, i)
            }
            mapOfSeen.put(b, i)
        }
        return intArrayOf()
    }
}