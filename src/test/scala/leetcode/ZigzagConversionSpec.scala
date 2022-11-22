package leetcode

import ZigzagConversion.convert
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ZigzagConversionSpec extends AnyFlatSpec with Matchers{

  "leetcode.LongestSubstringWithoutRepeatingCharacters" should "work as expected on the range" in {

    convert("PAYPALISHIRING", 3) shouldBe "PAHNAPLSIIGYIR"
  }

}
