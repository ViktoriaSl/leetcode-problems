package leetcode


import leetcode.AddTwoNumbers.addTwoNumbers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.collection.mutable.ArrayBuffer

class AddTwoNumbersSpec extends AnyFlatSpec {

  def traverseOutput(in: ListNode): ArrayBuffer[Int] = {
    var flag = true
    var numbers = in
    var out = ArrayBuffer.empty[Int]

    while (flag) {
      if (numbers.next != null) {
        out = out.appended(numbers.x)
        numbers = numbers.next
      } else {
        out = out.appended(numbers.x)
        flag = false
      }
    }
    out
  }

  "leetcode.AddTwoNumbers" should "work as with simple input" in {
    val nodes1 = (new ListNode(2, new ListNode(4, new ListNode(3))))
    val nodes2 = (new ListNode(5, new ListNode(6, new ListNode(4))))

    traverseOutput(addTwoNumbers(nodes1, nodes2)) shouldBe Array(7, 0, 8)

  }

  "leetcode.AddTwoNumbers" should "work with overflow" in {
    val nodes1 = (new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))
    val nodes2 = (new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))

    traverseOutput(addTwoNumbers(nodes1, nodes2)) shouldBe Array(8, 9, 9, 9, 0, 0, 0, 1)
  }

}
