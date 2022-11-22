package leetcode

import leetcode.StringCompression.compress
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class StringCompressionSpec extends AnyFlatSpec {

  "leetcode.compress" should "work as expected on the range" in {
    compress(Array('a', 'a', 'b', 'b', 'c', 'c', 'c')) shouldBe 6
  }

}
