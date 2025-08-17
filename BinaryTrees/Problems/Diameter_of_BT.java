package BinaryTrees.Problems;

public class Diameter_of_BT {
    /*
    int maxDia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        maxDia=Math.max(maxDia,lh+rh);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxDia;
    }
    public int findHeight(TreeNode root) {
        if(root==null) return 0;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    */

    int maxDia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return maxDia;
    }
    public int findHeight(TreeNode root) {
        if(root==null) return 0;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        maxDia=Math.max(maxDia,lh+rh);
        return Math.max(lh,rh)+1;
    }
}
