package BinaryTrees.Problems;

import java.util.ArrayList;
import java.util.List;

public class Right_view_of_BT {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        fn(root,0,ans);
        return ans;
    }
    void fn(TreeNode node,int level,List<Integer> ans){
        if(node==null) return;
        //add to ans if its the first time you've visited that level
        if(level==ans.size()) ans.add(node.val);
        fn(node.right,level+1,ans);
        fn(node.left,level+1,ans);
    }
}
