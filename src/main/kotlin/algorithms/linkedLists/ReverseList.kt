package algorithms.linkedLists

import algorithms.model.ListNode

class ReverseList {
    fun reverseListNode(input: ListNode?): ListNode? {
        var prev: ListNode? = null
        var cur = input
        var next: ListNode?
        //Такой цикл используем для обхода односвязного листа
        while (cur != null) {
            //записываем следующий элемент в next
            next = cur.next
            //ссылке следующего элемента присваиваем значение предыдущего
            cur.next = prev
            //присваиваем предыдущему элементу значению текущего элемента
            prev = cur
            //присваиваем текущему элементу значение предыдущего
            cur = next
        }
        return prev
    }
}