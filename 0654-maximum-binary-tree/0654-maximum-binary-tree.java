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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
    public TreeNode solve(int[] nums,int start,int end){
        if(start>end) return null;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int idx=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        TreeNode root=new TreeNode(nums[idx]);
        root.left=solve(nums,start,idx-1);
        root.right=solve(nums,idx+1,end);
        return root;
    }
}