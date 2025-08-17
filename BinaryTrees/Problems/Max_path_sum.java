package BinaryTrees.Problems;

public class Max_path_sum {
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxi;
    }
    int findMax(TreeNode node){
        if(node==null) return 0;
        int maxL=Math.max(0,findMax(node.left));
        int maxR=Math.max(0,findMax(node.right));
        maxi=Math.max(maxi,maxL+maxR+node.val);
        return Math.max(maxL,maxR)+node.val;
    }
}
