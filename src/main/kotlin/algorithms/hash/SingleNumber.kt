package algorithms.hash

/**
 * https://leetcode.com/problems/single-number/
 * Given a non-empty array of integers nums,
 * every element appears twice except for one. Find that single one.
 *
 */
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        /**
         * Xor of any two num gives the difference of bit as 1 and same bit as 0.
         * Thus, using this we get 1 ^ 1 == 0 because the same numbers have same bits.
         * So, we will always get the single element because all the same ones will evaluate to 0
         * and 0^single_number = single_number.
         */
        for (n in nums){
            result = result xor n
        }
        return result
    }
}