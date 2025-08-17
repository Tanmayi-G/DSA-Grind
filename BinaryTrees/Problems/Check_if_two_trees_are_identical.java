package BinaryTrees.Problems;

public class Check_if_two_trees_are_identical {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;
        if(p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)) return true;
        return false;
    }
}
