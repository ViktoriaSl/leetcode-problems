package leetcode

object GroupAnagrams {

  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.groupBy { v =>

      v.toCharArray.groupBy(identity).map {
        case (k, v) => (k, v.length)
      }
    }.values.toList.map(_.toList)
  }

}
