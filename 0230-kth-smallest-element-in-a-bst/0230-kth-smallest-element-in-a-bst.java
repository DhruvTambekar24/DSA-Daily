/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        HashSet<Integer> set=new HashSet<Integer>();
        traverse(root,set);
        int[] arr=set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        return arr[k-1];
    }
    public void traverse(TreeNode root,HashSet set){
        set.add(root.val);
        if(root.right!=null){
            traverse(root.right,set);
        }
        if(root.left!=null){
            traverse(root.left,set);
        }
    }
}