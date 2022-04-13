package org.train.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0208ImplementTrieTest {

    @Test
    void trieOperationsTest() {
        var trie = new $0208ImplementTrie();

        trie.insert("apple");
        assertTrue(trie.search("apple"));   // return True

        assertFalse(trie.search("app"));     // return False

        assertTrue(trie.startsWith("app")); // return True

        trie.insert("app");
        assertTrue(trie.search("app"));     // return True
    }
}