import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_postorder_using_1_stack {
    public List<Integer> postorderTraversal(TreeNode root) {
        //left right root
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        TreeNode temp=null;

        while(true){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                if(st.isEmpty()) break;
                temp=st.peek().right;
                if(temp!=null){
                    curr=temp;
                }else{
                    temp=st.pop();
                    ans.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.pop();
                        ans.add(temp.val);
                    }
                }
            }
        }

        return ans;
    }
}
