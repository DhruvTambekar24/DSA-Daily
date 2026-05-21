class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        for(int a : arr1){
            trie.insert(a);
        }
        int max=0;
        for(int a : arr2){
            max=Math.max(max,trie.prefix(a));
        }
        return max;
    }
}
class Trienode{
    Trienode children[] = new Trienode[10];
}
class Trie{
    Trienode root = new Trienode();
    void insert(int num){
        Trienode curr = root;
        String s = Integer.toString(num);
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i) -'0';
            if(curr.children[idx]==null){
                Trienode temp = new Trienode();
                curr.children[idx]=temp;
            }
            curr=curr.children[idx];
        }
    }
    int prefix(int num){
        Trienode curr = root;
        String s = Integer.toString(num);
        int len=0;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'0';
            if(curr.children[idx]!=null) {
                len++;
                curr = curr.children[idx];
            } else break;
        }
        return len;
    }
}