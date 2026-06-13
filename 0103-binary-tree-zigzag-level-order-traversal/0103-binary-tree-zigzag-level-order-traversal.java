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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        if(root==null){
            return list;
        }
        q.offer(root);
        int flag=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> slist=new LinkedList<Integer>();
            for(int i=0;i<n;i++){
                if(q.peek().left !=null) q.offer(q.peek().left);
                if(q.peek().right !=null) q.offer(q.peek().right);
                slist.add(q.poll().val);
            }
            if(flag==0){
              list.add(slist);
              flag=1;
            }
            else{
                Collections.reverse(slist);
                list.add(slist);
                flag=0;
            }
            
        }
        return list;
    }
}