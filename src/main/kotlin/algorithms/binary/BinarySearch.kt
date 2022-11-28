package algorithms.binary

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        //крайний левый индекс
        var start = 0
        //крайний правый индекс
        var end = nums.size - 1
        while(start <= end) {
            //Индекс среднего элемент
            var middle = ((start + end) / 2)
            //Средний элемент
            var cur = nums[middle]
            if (cur == target) {
                return middle
            } else if (cur > target) {
                //Если средний элмент БОЛЬШЕ искомого
                // то конечный индекс = индекс середины - 1
                end = middle--
            } else if (cur < target) {
                //Если средний элмент МЕНЬШЕ искомого
                // то начанлый индекс = индекс середины + 1
                start =  middle++
            }
        }
        return -1
    }
}