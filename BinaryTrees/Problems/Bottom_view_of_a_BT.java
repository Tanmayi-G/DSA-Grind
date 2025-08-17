package BinaryTrees.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    Node node; int vertical;
    Pair(Node node, int vertical){
        this.node=node;
        this.vertical=vertical;
    }
}

public class Bottom_view_of_a_BT {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        
        TreeMap<Integer,Integer> map=new TreeMap<>(); //map(vertical,node)
        Queue<Pair> q=new LinkedList<>(); //q(node,vertical)
        
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair pair=q.poll();
            Node node=pair.node;
            int x=pair.vertical;
            
            map.put(x,node.data);
            
            if(node.left!=null) q.add(new Pair(node.left,x-1));
            if(node.right!=null) q.add(new Pair(node.right,x+1));
        }
        
        for(int val:map.values()){
            ans.add(val);
        }
        return ans;
    }
}
