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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList<> ();
        POT(root,ans);
        return ans;
    }
    private void POT(TreeNode root ,List <Integer> ans ){
        if(root!=null){
            ans.add(root.val);
            POT(root.left,ans);
            POT(root.right,ans);
        }
    }
}