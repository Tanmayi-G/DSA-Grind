import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right = null; }
}

 class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
 }

public class All_in_one_traversal {
    List<List<Integer>> treeTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> preorder=new ArrayList<>();
        List<Integer> inorder=new ArrayList<>();
        List<Integer> postorder=new ArrayList<>();
        Stack<Pair> st=new Stack<>();

        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair pair=st.pop();
            if(pair.num==1){ //preorder
                preorder.add(pair.node.data);
                pair.num++; st.push(pair);
                if(pair.node.left!=null) st.push(new Pair(pair.node.left,1));
            }else if(pair.num==2){ //inorder
                inorder.add(pair.node.data);
                pair.num++; st.push(pair);
                if(pair.node.right!=null) st.push(new Pair(pair.node.right,1));
            }else{ //postorder
                postorder.add(pair.node.data);
            }
        }
        ans.add(inorder);
        ans.add(preorder);
        ans.add(postorder);
        return ans;
    }
}