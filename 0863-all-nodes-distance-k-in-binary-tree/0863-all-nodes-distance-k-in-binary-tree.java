/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        markParents(root,parent);
        Map<TreeNode, Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        int currLevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(currLevel==k) break;
            currLevel++;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.containsKey(curr.left)){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null && !visited.containsKey(curr.right)){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if(parent.get(curr)!=null && !visited.containsKey(parent.get(curr))) {
                    q.offer(parent.get(curr));
                    visited.put(parent.get(curr),true);
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;
    }
    private void markParents(TreeNode root, Map<TreeNode,TreeNode> parent) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null) {
                parent.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null) {
                parent.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
}