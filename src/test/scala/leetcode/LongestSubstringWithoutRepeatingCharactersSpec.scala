package leetcode

import leetcode.LongestSubstringWithNonRepeating.lengthOfLongestSubstring
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LongestSubstringWithoutRepeatingCharactersSpec extends AnyFlatSpec with Matchers{

  "leetcode.LongestSubstringWithoutRepeatingCharacters" should "work as expected on the range" in {

    lengthOfLongestSubstring("tmmzuxt") shouldBe 5
    lengthOfLongestSubstring("pwwkew") shouldBe 3
    lengthOfLongestSubstring("abcabcbb")  shouldBe 3
    lengthOfLongestSubstring("bbbbb")  shouldBe 1
  }

}
