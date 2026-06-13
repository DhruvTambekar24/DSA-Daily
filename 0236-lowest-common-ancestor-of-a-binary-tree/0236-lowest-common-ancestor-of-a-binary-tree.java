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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1=new ArrayList<>();
        ArrayList<TreeNode> list2=new ArrayList<>();
        getPath(root,p,list1);
        getPath(root,q,list2);
        TreeNode lca=null;
        int i=0;
        while(i<list1.size() && i<list2.size()){
            if(list1.get(i)==list2.get(i)){
                lca=list1.get(i);
            }
            else{
                break;
            }
            i++;
        }
        return lca;

    }
    private boolean getPath(TreeNode root,TreeNode ele, ArrayList<TreeNode> list){
        if(root==null){
            return false;
        }
        list.add(root);
        if(root==ele){
            return true;
        }
        if(getPath(root.left,ele,list) || getPath(root.right,ele,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}