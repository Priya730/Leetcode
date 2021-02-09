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
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return null;
        
        int sum = 0;
        TreeNode node = root;
        
        while(node != null){
            // no right tree 
            if(node.right == null){
                sum += node.val;
                node.val = sum;
                node = node.left;
            }
            
            //right tree
            else{
                TreeNode succ = nextGreater(node);
                
                //left is null -- unvisited
                
                if(succ.left == null){
                    succ.left = node;
                    node = node.right;
                }
                
                //not null -- visited
                
                else{
                    succ.left = null;
                    sum+= node.val;
                    node.val = sum;
                    node = node.left;
                }
            }
        }
        
        return root;
    }
    
    TreeNode nextGreater(TreeNode node){
        TreeNode succ = node.right;
        
        while(succ.left != null && succ.left != node){
            succ = succ.left;
        }
        
        return succ;
    }
    
}