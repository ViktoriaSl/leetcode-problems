package leetcode.trie

import scala.collection.mutable

object PrefixTrieExample {

  sealed trait Trie {

    def insert(key: String): TrieNode

    def findByPrefix(prefix: String): Seq[String]

    def contains(word: String): Boolean

    def remove(word: String): Boolean

  }

  class TrieNode(word: Boolean = false) extends Trie {

    private val children: mutable.HashMap[Char, TrieNode] = new mutable.HashMap[Char, TrieNode]()

    override def insert(key: String): TrieNode = {

      key.foldLeft(children) { case (children, char) =>

        if (!children.contains(char)) {
          children.+=(char -> new TrieNode())
        }

        children(char).children
      }

      this
    }

    override def findByPrefix(prefix: String): Seq[String] = ???

    override def contains(word: String): Boolean = {
      var childMap = children

      word.collectFirst { char =>

        val res = childMap.contains(char)
        childMap = children.get(char).map(_.children).getOrElse(mutable.HashMap.empty[Char, TrieNode])

        res
      }.getOrElse(false)
    }

    override def remove(word: String): Boolean = ???
  }

}
