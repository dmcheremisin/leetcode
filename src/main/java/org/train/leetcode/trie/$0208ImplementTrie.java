package org.train.leetcode.trie;

//A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.
//There are various applications of this data structure, such as autocomplete and spellchecker.
//Implement the Trie class:
//
//Trie() Initializes the trie object.
//void insert(String word) - Inserts the string word into the trie.
//boolean search(String word) - Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
//boolean startsWith(String prefix) - Returns true if there is a previously inserted string word that has the prefix 'prefix', and false otherwise.

public class $0208ImplementTrie {

    private Node head;

    static class Node {
        private final char c;
        private boolean isFinal;
        private Node left, right, middle;
        public Node(char c) {
            this.c = c;
        }
    }

    public void insert(String word) {
        head = put(head, word, 0);
    }

    private Node put(Node node, String word, int pos) {
        char c = word.charAt(pos);
        if (node == null)
            node = new Node(c);

        if(c < node.c)
            node.left = put(node.left, word, pos);
        else if(c > node.c)
            node.right = put(node.right, word, pos);
        else if (pos < word.length() - 1)
            node.middle = put(node.middle, word, pos + 1);
        else
            node.isFinal = true;

        return node;
    }

    public boolean search(String word) {
        Node node = get(head, word, 0);
        return node != null && node.isFinal;
    }

    private Node get(Node node, String word, int pos) {
        if (node == null)
            return null;

        char c = word.charAt(pos);
        if(c < node.c)
            return get(node.left, word, pos);
        else if(c > node.c)
            return get(node.right, word, pos);
        else if(pos < word.length() - 1)
            return get(node.middle, word, pos + 1);

        return node;
    }

    public boolean startsWith(String prefix) {
        return get(head, prefix, 0) != null;
    }
}
