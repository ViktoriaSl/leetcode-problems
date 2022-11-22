package leetcode

import scala.annotation.tailrec

/**
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
 * reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object AddTwoNumbers {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    @tailrec
    def rec(l1: ListNode, l2: ListNode, r: Array[Int] = Array.emptyIntArray, carry: Int = 0): Array[Int] = {
      (l1, l2) match {
        case (null, null) if carry == 0 => r
        case (null, null) =>
          r :+ (carry)
        case (value, null) =>
          val sum = value.x + carry
          val newCarry = sum / 10
          rec(value.next, l2, r :+ ((sum) % 10), newCarry)
        case (null, value) =>
          val sum = value.x + carry
          val newCarry = sum / 10
          rec(l1, value.next, r :+ ((sum) % 10), newCarry)
        case (lOne, lTwo) =>
          val a = lOne.x
          val b = lTwo.x
          val sum = carry + a + b
          val newCarry = sum / 10

          rec(l1.next, l2.next, r :+ (sum % 10), newCarry)
      }
    }

    val nodesResult = rec(l1, l2).reverse.foldLeft[Option[ListNode]](None) { case (a, r) =>
      a match {
        case Some(value) =>
          Some(new ListNode(r, value))
        case None =>
          Some(new ListNode(r))
      }
    }

    nodesResult.getOrElse(new ListNode(0))
  }

}
