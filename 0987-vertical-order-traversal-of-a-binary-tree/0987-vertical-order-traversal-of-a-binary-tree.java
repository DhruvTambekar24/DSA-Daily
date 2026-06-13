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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            TreeNode node=p.node;
            int col=p.col;
            int row=p.row;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);
            if(node.left !=null)
                q.offer(new Pair(node.left,col-1,row+1));
            if(node.right!=null)
                q.offer(new Pair(node.right,col + 1,row + 1));
        }
        List<List<Integer>> result=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> rows : map.values()){
            List<Integer> colList=new ArrayList<>();
            for(PriorityQueue<Integer> pq : rows.values()){
                while(!pq.isEmpty()){
                    colList.add(pq.poll());
                }
            }
            result.add(colList);
        }
        return result;
    }
    class Pair {
     TreeNode node;
     int col,row;
     Pair(TreeNode node,int col,int row){
        this.node = node;
        this.col = col;
        this.row = row;
      }
    }
}