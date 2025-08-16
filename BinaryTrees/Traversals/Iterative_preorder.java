import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        //root left right
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            ans.add(node.val);
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }
        return ans;
    }
}
