package algorithms.binary

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * @see https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
class RotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        //Проверяем, что массив не null и не пустой
        if (nums == null || nums.isEmpty())
            return -1

        // Используем бинарный поиск, чтобы найти индекс наимегьшего элемента
        // Это надо чтобы понять где сдвинут(повёрнут) массив
        var min = 0
        var max = nums.size - 1
        //запомнить цикл алгоритм.
        // Служит для поиска минимального элемента
        while (min < max) {
            var mid = min + (max - min) / 2
            if (nums[mid] > nums[max]) {
                min = mid + 1
            } else {
                max = mid
            }
        }

        var startPoint = min
        min = 0
        max = nums.size - 1

        //Выбираем какой из двух полученных target надо перебрать
        if (target >= nums[startPoint] && target <= nums[max]) {
            //Вторая половина массива
            min = startPoint
        } else {
            //Первая половина массива
            max = startPoint
        }

        //Бинарный поиск в нужном массиве указзаного элемента
        while (min <= max) {
            var mid = min + (max - min) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                min = mid + 1
            } else {
                max = mid - 1
            }
        }
        return -1
    }
}