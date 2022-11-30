package algorithms.binary

class RotatedSortedArrayII {
    fun search(nums: IntArray, target: Int): Boolean {
        if(nums == null || nums.isEmpty()) {
            return false
        }
        var min = 0
        var max = nums.size - 1
        // Поиск точки pivot - разворта
        // min = pivot
        while (min <= max) {
            var mid = min + (max - min) / 2
            if(nums[mid] == target) {
                return true
            }
            if (!isBinarySearchHelpful(nums, min, nums[mid])) {
                min++
            }

            var pivotAr = existsInFirst(nums, min, nums[mid])
            var targetAr = existsInFirst(nums, min, target)
            //xor https://ru.wikipedia.org/wiki/%D0%98%D1%81%D0%BA%D0%BB%D1%8E%D1%87%D0%B0%D1%8E%D1%89%D0%B5%D0%B5_%C2%AB%D0%B8%D0%BB%D0%B8%C2%BB
            if (pivotAr.xor(targetAr)) {
                if (pivotAr) {
                    min = mid + 1; // pivot in the first, target in the second
                } else {
                    max = mid - 1; // target in the first, pivot in the second
                }
            } else {
                if (nums[mid] < target) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        return false
    }

    // Проверка, что искомый element в первом массиве
    // для этого element <= элемент с индксом start
    private fun existsInFirst(arr: IntArray, start: Int, element: Int): Boolean {
        return arr[start] <= element;
    }

    private fun isBinarySearchHelpful(arr: IntArray, left: Int, element: Int): Boolean {
        return arr[left] != element;
    }
}