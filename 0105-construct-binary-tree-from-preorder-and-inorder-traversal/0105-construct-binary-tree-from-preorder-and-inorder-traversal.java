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
    int pre=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int start,int end){
        if(start>end) return null;
        int root=preorder[pre++];
        TreeNode roott = new TreeNode(root);
        int inIndex=map.get(root);
        roott.left=helper(preorder,start,inIndex-1);
        roott.right=helper(preorder,inIndex+1,end);
        return roott;
    }
}