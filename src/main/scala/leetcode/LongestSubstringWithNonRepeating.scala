package leetcode

import scala.collection.mutable

object LongestSubstringWithNonRepeating {
  def lengthOfLongestSubstring(s: String): Int = {

    val charWithIndexes =  mutable.HashMap.empty[Char, Int]
    var i = 0
    var j = 0

    var answer = 0

    while (j >= i && j < s.length){

      val char =  s(j)

      if(charWithIndexes.contains(char)){

        i = Math.max(charWithIndexes(char), i)
      }

      answer = Math.max(j - i + 1, answer)

      charWithIndexes.+=((char, j + 1))
      j = j + 1

    }

    answer
  }
}
