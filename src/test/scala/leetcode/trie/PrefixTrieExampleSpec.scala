package leetcode.trie

import leetcode.trie.PrefixTrieExample.TrieNode
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class PrefixTrieExampleSpec extends AnyFlatSpec{

  "PrefixTrieExample" should "work as expected on the range" in {
    val trie = new TrieNode()

    trie.insert("hello")
    trie.insert("helicopter")
    trie.insert("holidays")
    trie.insert("world")

    trie.contains("holidays") shouldBe true
  }

}
