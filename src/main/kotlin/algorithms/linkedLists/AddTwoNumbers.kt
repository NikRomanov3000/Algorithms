package algorithms.linkedLists

import algorithms.model.ListNode

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * @see https://leetcode.com/problems/add-two-numbers/
 * @see https://redquark.org/leetcode/0002-add-two-numbers/
 */
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head1 = l1
        var head2 = l2


        var result: ListNode? = null
        var temp: ListNode? = null

        var carryDigit = 0

        while (head1 != null || head2 != null) {
            var sum = carryDigit
            if (head1 != null) {
                sum += head1.`val`
                head1 = head1.`next`
            }
            if (head2 != null) {
                sum += head2.`val`
                head2 = head2.`next`
            }
            val node = ListNode(sum % 10)
            carryDigit = sum / 10

            if (temp == null) {
                result = node
                temp = result
            } else {
                temp.next = node
                temp = temp.next
            }

            if (carryDigit > 0) {
                // temp.next = new ListNode(carry);
                temp!!.next = ListNode(carryDigit)
            }

        }
        return result
    }
}