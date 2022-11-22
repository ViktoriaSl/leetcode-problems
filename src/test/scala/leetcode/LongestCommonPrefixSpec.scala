package leetcode

import leetcode.LongestCommonPrefix.longestCommonPrefix
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LongestCommonPrefixSpec extends AnyFlatSpec {

  "leetcode.longestCommonPrefix" should "work as expected on the range" in {

    longestCommonPrefix(Array("flower", "flow", "flight")) shouldBe "fl"
    longestCommonPrefix(Array("flower", "flyflow", "floight")) shouldBe "fl"
    longestCommonPrefix(Array("dog", "racecar", "car")) shouldBe ""
    longestCommonPrefix(Array("a")) shouldBe "a"
    longestCommonPrefix(Array("ab", "a")) shouldBe "a"
    longestCommonPrefix(Array("a", "a")) shouldBe "a"

  }

  "leetcode.longestCommonPrefix" should "handle negative scenarios" in {

    longestCommonPrefix(Array("reflower", "flow", "flight")) shouldBe ""
    longestCommonPrefix(Array("dog", "racecar", "car")) shouldBe ""
    longestCommonPrefix(Array("", "b")) shouldBe ""

    longestCommonPrefix(Array("", "")) shouldBe ""
    longestCommonPrefix(Array.empty) shouldBe ""

  }


}
