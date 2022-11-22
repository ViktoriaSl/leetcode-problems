package leetcode

/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
object ReverseVowelsOfAString extends App {
  def reverseVowels(s: String): String = {
    val inStr: StringBuilder = new StringBuilder(s)

    def isVowel(ch: Char): Boolean = {
      ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' ||
        ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I'
    }

    var i = 0
    var j = inStr.length - 1
    while (i < j) {

      if (!isVowel(inStr(i))) {
        i = i + 1
      } else if (!isVowel(inStr(j))) {
        j = j - 1
      } else {
        val iV = inStr(i)
        val jV = inStr(j)

        if (iV.toUpper != jV.toUpper) {
          inStr(i) = jV
          inStr(j) = iV
        }

        i = i + 1
        j = j - 1
      }

    }

    inStr.mkString("")
  }
}
