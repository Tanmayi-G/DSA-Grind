package BinaryTrees.Problems;

public class Symmetric_BT {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSame(root.left,root.right);
    }
    boolean isSame(TreeNode p,TreeNode q){
        if(p==null || q==null) return p==q;
        if(p.val==q.val && isSame(p.left,q.right) && isSame(p.right,q.left)) return true;
        return false;
    }
}
