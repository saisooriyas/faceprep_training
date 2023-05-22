package data_structure.trie;

public class trie {
    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
        TrieNode(){
            isEndOfWord = false;
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    static TrieNode root;
    static void insert(String key){
        int level;
        int length = key.length();
        int index;
        TrieNode temp = root;
        for(level=0;level<length;level++){
            index = key.charAt(level) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
        }
        temp.isEndOfWord = true;
    }
    static boolean search(String key){
        int level;
        int length = key.length();
        int index;
        TrieNode temp = root;
        for(level=0;level<length;level++){
            index = key.charAt(level) - 'a';
            if(temp.children[index] == null){
                return false;
            }
            temp = temp.children[index];
        }
        return (temp!=null && temp.isEndOfWord);
    }
    public static void main(String[] args){
        String[] keys = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String[] output = {"Not present in trie", "Present in trie"};
        root = new TrieNode();
        int i;
        for(i=0;i<keys.length;i++){
            insert(keys[i]);
        }
        if(search("the")){
            System.out.println("the "+output[1]);
        }
        else{
            System.out.println("the "+output[0]);
        }
        if(search("these")){
            System.out.println("these "+output[1]);
        }
        else{
            System.out.println("these "+output[0]);
        }
        if(search("their")){
            System.out.println("their "+output[1]);
        }
        else{
            System.out.println("their "+output[0]);
        }
        if(search("thaw")){
            System.out.println("thaw "+output[1]);
        }
        else{
            System.out.println("thaw "+output[0]);
        }
    }
}
