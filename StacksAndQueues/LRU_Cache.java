package StacksAndQueues;

import java.util.HashMap;
import java.util.Map;

class Node{
    int key,val;
    Node prev,next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}

class LRU_Cache {
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int capacity;
    Map<Integer,Node> map=new HashMap<>();

    public LRU_Cache(int capacity) {
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insertAtBeginning(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node newNode=new Node(key,value);
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insertAtBeginning(newNode);
    }

    void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=null; node.prev=null;
        
        map.remove(node.key);
    }

    void insertAtBeginning(Node node){
        Node nextNode=head.next;
        head.next=node;
        node.next=nextNode;
        nextNode.prev=node;
        node.prev=head;

        map.put(node.key,node);
    }
}
