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
    int post=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder){
        post=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] postorder,int start,int end){
        if(start>end) return null;
        int root=postorder[post--];
        TreeNode roott = new TreeNode(root);
        int inIndex=map.get(root);
        roott.right=helper(postorder,inIndex+1,end);
        roott.left=helper(postorder,start,inIndex-1);
        return roott;
    }
}