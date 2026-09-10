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
    public int averageOfSubtree(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        Stack<TreeNode> temp=new Stack<>();
        HashMap<TreeNode,Integer> sum=new HashMap<>();
        HashMap<TreeNode,Integer> count=new HashMap<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            temp.push(node);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        int ans=0;
        while(!temp.isEmpty()){
            TreeNode node=temp.pop();
            int s=node.val;
            int c=1;
            if(node.left!=null){
                s+=sum.get(node.left);
                c+=count.get(node.left);
            }
            if(node.right!=null){
                s+=sum.get(node.right);
                c+=count.get(node.right);
            }
            sum.put(node,s);
            count.put(node,c);
            if(node.val==s/c){
                ans++;
            }
        }
        return ans;
    }
}