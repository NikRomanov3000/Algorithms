package algorithms.binary

/**
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
class SearchMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in 0 until matrix.size) {
            var arr = matrix[i]
            if (target <= arr[arr.size - 1]) {
                for (j in 0 until arr.size) {
                    if (arr[j] == target) {
                        return true
                    }
                }
            }
        }
        return false
    }
}