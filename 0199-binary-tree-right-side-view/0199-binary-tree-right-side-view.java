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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        List<Integer> res=new ArrayList<Integer>();
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> slist=new LinkedList<Integer>();
            for(int i=0;i<n;i++){
                if(q.peek().left !=null) q.offer(q.peek().left);
                if(q.peek().right !=null) q.offer(q.peek().right);
                slist.add(q.poll().val);
            }
            int c=slist.get(slist.size()-1);
            res.add(c);
        }
        return res;
    }
}