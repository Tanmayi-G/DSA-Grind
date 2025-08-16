import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_postorder_using_2_stacks {
    public List<Integer> postorderTraversal(TreeNode root) {
        //left right root
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode node=st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }

        while(!st2.isEmpty()) ans.add(st2.pop().val);
        return ans;
    }
}
