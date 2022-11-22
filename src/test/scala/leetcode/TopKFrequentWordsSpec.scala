package leetcode

import TopKFrequentWords.topKFrequent
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TopKFrequentWordsSpec extends AnyFlatSpec with Matchers {

  "leetcode.topKFrequent" should "work with positive testcases" in {
    topKFrequent(Array("i", "love", "leetcode", "i", "love", "coding"), 2) shouldBe Array("i", "love")
    topKFrequent(Array("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4) shouldBe Array("the", "is", "sunny", "day")
  }

}
