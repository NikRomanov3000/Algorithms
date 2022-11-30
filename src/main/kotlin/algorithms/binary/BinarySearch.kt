package algorithms.binary

/**
 * Сложность O(log n), в лучшем — O(1) (если обнаруживаем искомый элемент на первой итерации).
 * Для сравнения: вычислительная сложность линейного поиска равна O(n) - обычный проход по всем элементам в поисках нужного
 */
class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        //крайний левый индекс
        var start = 0
        //крайний правый индекс
        var end = nums.size - 1
        while (start <= end) {
            //Индекс среднего элемент
            var middle = start + ((end - start) / 2)
            //Средний элемент
            var cur = nums[middle]
            if (cur == target) {
                return middle
            } else if (cur > target) {
                //Если средний элмент БОЛЬШЕ искомого
                // то конечный индекс = индекс середины - 1
                end = middle - 1
            } else if (cur < target) {
                //Если средний элмент МЕНЬШЕ искомого
                // то начанлый индекс = индекс середины + 1
                start = middle + 1
            }
        }
        return -1
    }
}