package leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import leetcode.GroupAnagrams.groupAnagrams

class GroupAnagramsSpec extends AnyFlatSpec with Matchers {

  "leetcode.GroupAnagrams" should "work as expected on the range" in {

    groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")) shouldBe
      List(List("bat"), List("eat", "tea", "ate"), List("tan", "nat"))
  }

}
