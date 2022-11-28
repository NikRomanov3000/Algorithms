package algorithms.linkedLists

import algorithms.model.ListNode
import java.util.*
import kotlin.collections.HashSet

/**
 * Linked List Cycle
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * @see https://leetcode.com/problems/linked-list-cycle/
 */
class LinkedListCycle {
    fun hasCycle(input: ListNode): Boolean {
        var head = input;
        val mp = HashSet<ListNode>()
        //Такой цикл используем для обхода односвязного листа
        while (head != null) {
            //если такой элемент есть в коллекции, то есть цикл
            if (mp.contains(head)){
                return true
            }
            //Добавляем элемент в перечисление, если такого там нет
            mp.add(head)
            //переходим к следующему элементу
            head = head.next
        }

        return false
    }
}