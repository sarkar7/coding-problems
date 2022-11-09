package sarkar.algo.trie;

public class TrieImpl {

    private static final int ALPHABET_SIZE = 26;
    private static TrieNode trieNode;

    public static void insert(String key) {
        int length = key.length();
        TrieNode root = trieNode;

        for (int level = 0; level < length; level++) {
            int index = key.charAt(level) - 'a';
            if (root.children[index] == null)
                root.children[index] = new TrieNode();
            root = root.children[index];
        }
        root.isEndOfWord = true;
    }

    public static boolean search(String key) {
        int length = key.length();
        TrieNode root = trieNode;

        for (int level = 0; level < length; level++) {
            int index = key.charAt(level) - 'a';
            if (root.children[index] == null)
                return false;
            root = root.children[index];
        }
        return (root != null && root.isEndOfWord);
    }

    public static void main(String[] args) {
        String[] keys = {"bad", "bat", "geeks", "geeks", "cat", "cut"};
        String[] output = {"NO", "YES"};
        trieNode = new TrieNode();

        for (String key : keys) insert(key);

        if (search("bad"))
            System.out.println("bad --- " + output[1]);
        else System.out.println("bad --- " + output[0]);

        if (search("geeks"))
            System.out.println("geeks --- " + output[1]);
        else System.out.println("geeks --- " + output[0]);

        if (search("ca"))
            System.out.println("ca --- " + output[1]);
        else System.out.println("ca --- " + output[0]);
    }


    private static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }
}
