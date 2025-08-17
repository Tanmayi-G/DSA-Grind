package BinaryTrees.Problems;

import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

public class Boundary_traversal {
    ArrayList<Integer> boundaryTraversal(Node root) {
        //add left boundary, add leaf nodes, add right boundary in reverse order
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        
        if(!isLeafNode(root)) ans.add(root.data);
        addLeftBoundary(root,ans);
        addLeafNodes(root,ans);
        addRightBoundary(root,ans);
        
        return ans;
    }
    
    boolean isLeafNode(Node node){
        return (node.left==null && node.right==null);
    }
    
    void addLeftBoundary(Node root,ArrayList<Integer> ans){
        Node node=root.left;
        while(node!=null){
            if(!isLeafNode(node)) ans.add(node.data);
            if(node.left!=null) node=node.left;
            else node=node.right;
        }
    }
    
    void addLeafNodes(Node node,ArrayList<Integer> ans){
        if(node==null) return;
        if(isLeafNode(node)){
            ans.add(node.data);
            return;
        } 
        //else
        addLeafNodes(node.left,ans);
        addLeafNodes(node.right,ans);
    }
    
    void addRightBoundary(Node root, ArrayList<Integer> ans){
        Node node=root.right;
        Stack<Integer> st=new Stack<>();
        while(node!=null){
            if(!isLeafNode(node)) st.push(node.data);
            if(node.right!=null) node=node.right;
            else node=node.left;
        }
        while(!st.isEmpty()) ans.add(st.pop());
    }
}
