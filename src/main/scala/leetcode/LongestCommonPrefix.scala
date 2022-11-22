package leetcode

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
object LongestCommonPrefix extends App {

  def longestCommonPrefix(strs: Array[String]): String = {
    sealed trait Trie {
      def insert(key: String): TrieNode

      def findLongestPrefix: String
    }

    class TrieNode extends Trie {

      private val children: mutable.HashMap[String, TrieNode] = new mutable.HashMap[String, TrieNode]()

      override def insert(key: String): TrieNode = {

        key match {
          case "" =>
            children.+=("" -> new TrieNode())
          case _ =>
            key.foldLeft(children) { case (children, char) =>
              val ch = char.toString

              if (!children.contains(ch)) {
                children.+=(ch -> new TrieNode())
              }

              children(ch).children
            }
        }
        this
      }

      def findLongestPrefix: String = {
        @tailrec
        def find(children: mutable.HashMap[String, TrieNode], result: mutable.ArrayBuffer[String] = ArrayBuffer.empty): ArrayBuffer[String] = {
          if (children.size == 1) {
            val (char, word) = children.head
            find(word.children, result.:+(char))
          } else {
            result
          }
        }

        find(this.children).mkString("")
      }
    }
    val trie = new TrieNode()

    strs.length match {
      case 0 => ""
      case 1 => strs.head
      case _ =>

        val min = strs.foldLeft(Int.MaxValue) { case (minCound, word) =>
          trie.insert(word)

          Math.min(minCound, word.length)
        }

        trie.findLongestPrefix.take(min)
    }
  }
}
