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
    public int countNodes(TreeNode root) {
        // to check complete binary tree
        if (root==null) return 0;
        int LeftHeight =0,RightHeight=0;
        TreeNode LeftRoot =root,  RightRoot = root;
        while(LeftRoot!=null) {LeftHeight++; LeftRoot=LeftRoot.left;}
        while(RightRoot!=null) {RightHeight++; RightRoot=RightRoot.right;}
        if(LeftHeight==RightHeight) return (1<<LeftHeight)-1;
        return 1+countNodes(root.left)+countNodes(root.right); // count node level
    }
}
