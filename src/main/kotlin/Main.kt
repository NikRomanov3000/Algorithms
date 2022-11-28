import algorithms.model.ListNode
import java.util.*
import kotlin.collections.HashSet
import kotlin.random.Random

fun main(args: Array<String>) {
    var input = ListNode.createList(1, 2, 3, 4, 5, 6, 7, 8, 9)

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

    println(prev.toString())
}