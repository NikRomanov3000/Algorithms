package algorithms

import java.util.*

/**
 *  Merge k Sorted Lists
 *  You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *  Merge all the linked-lists into one sorted linked-list and return it.
 *
 *  @see https://leetcode.com/problems/merge-k-sorted-lists/
 */
class ArrayOfKLinkedList {
    private fun addToFirstList(firstList: LinkedList<Int>, item: Int) {
        for (i in 0 until firstList.size) {
            if (item > firstList.last) {
                firstList.add(firstList.size, item)
                break
            } else if (item < firstList[i]) {
                firstList.add(i, item)
                break
            }
        }
    }

    fun mergeKLists(lists: Array<LinkedList<Int>>): LinkedList<Int> {
        return if (lists.isEmpty()) {
            LinkedList<Int>()
        } else {
            val firstList = lists[0]
            for (i in 1 until lists.size) {
                for (j in lists[i]) {
                    addToFirstList(firstList, j)
                }
            }
            firstList
        }
    }
}