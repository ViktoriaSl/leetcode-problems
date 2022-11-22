package leetcode

import scala.collection.mutable

/**
 * 692. Top K Frequent Words
 * Given an array of strings words and an integer k, return the k most frequent strings.
 *
 * Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 *
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 */
object TopKFrequentWords {

  def topKFrequent(words: Array[String], k: Int): List[String] = {

    var data = mutable.ArrayBuffer.empty[(String, Int)]
    var dataWithWords = words.groupBy(identity).map { case (k, v) => (k, v.length) }

    words.sorted.foreach { word =>
      if (dataWithWords.isDefinedAt(word)) {
        data = data.+=((word, dataWithWords(word)))
        dataWithWords = dataWithWords.-(word)
      }
    }

    data.toList.sortBy { case (word, fr) => (-fr, word) }.take(k).map(t => t._1)
  }

}
