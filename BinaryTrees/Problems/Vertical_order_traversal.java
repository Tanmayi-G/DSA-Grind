package BinaryTrees.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Tuple{
    TreeNode node;
    int vertical,level;
    Tuple(TreeNode node,int vertical,int level){
        this.node=node;
        this.vertical=vertical;
        this.level=level;
    }
}

public class Vertical_order_traversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;

        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>(); //<vertical<level<multinodes>>>
        Queue<Tuple> q=new LinkedList<>(); //q(node,vertical,level)
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.vertical;
            int y=tuple.level;

            if(!map.containsKey(x)) map.put(x,new TreeMap<>());
            if(!map.get(x).containsKey(y)) map.get(x).put(y,new PriorityQueue<>());
            map.get(x).get(y).add(node.val);

            if(node.left!=null) q.add(new Tuple(node.left,x-1,y+1));
            if(node.right!=null) q.add(new Tuple(node.right,x+1,y+1));
        }

        for(TreeMap<Integer,PriorityQueue<Integer>> level:map.values()){ //OR: for(var level:map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> pq:level.values()){ //OR: for(var pq:level.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }

        return ans;
    }
}
