package leetcode

import leetcode.ReverseVowelsOfAString.reverseVowels
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseVowelsOfAStringSpec extends AnyFlatSpec with Matchers {

  "leetcode.reverseVowels" should "reverse vowels" in {
    reverseVowels("leetcode") shouldBe "leotcede"
    reverseVowels("ai") shouldBe "ia"
    reverseVowels("Yo! Bottoms up, U.S. Motto, boy!") shouldBe "Yo! Bottoms up, U.S. Motto, boy!"
  }

}
