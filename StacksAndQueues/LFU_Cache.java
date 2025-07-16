package StacksAndQueues;

import java.util.HashMap;
import java.util.Map;

class DLLNode{
    int key,val,freq;
    DLLNode prev,next;
    DLLNode(int key,int val){
        this.key=key;
        this.val=val;
        this.freq=1;
    }
}

class DLL{
    DLLNode head,tail;
    int listSize;

    DLL(){
        this.head=new DLLNode(-1,-1);
        this.tail=new DLLNode(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.listSize=0;
    }

    void addNode(DLLNode node){
        DLLNode nextNode=head.next;
        head.next=node;
        node.next=nextNode;
        nextNode.prev=node;
        node.prev=head;
        listSize++;
    }

    void removeNode(DLLNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=null; node.prev=null;
        listSize--;
    }
}

class LFU_Cache {
    Map<Integer, DLL> freqMap;
    Map<Integer, DLLNode> cacheMap;
    int currSize;
    int capacity;
    int minFreq;  

    public LFU_Cache(int capacity) {
        this.freqMap=new HashMap<>();
        this.cacheMap=new HashMap<>();
        this.currSize=0;
        this.capacity=capacity;
        this.minFreq=0;
    }
    
    public int get(int key) {
        DLLNode node=cacheMap.get(key);
        if(node==null) return -1;
        updateNode(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        //conditions to check:
        //  - if node already present
        //  - if capacity is exceeded

        if(cacheMap.containsKey(key)){
            DLLNode node=cacheMap.get(key);
            node.val=value;
            updateNode(node);
        }else{
            if(currSize==capacity){
                DLL minFreqList=freqMap.get(minFreq);
                cacheMap.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                currSize--;
            }
            
            currSize++; minFreq=1;
            DLLNode newNode=new DLLNode(key,value);
            DLL list=freqMap.getOrDefault(1,new DLL());
            list.addNode(newNode);
            freqMap.put(1,list);
            cacheMap.put(key,newNode);
        }

    }

    void updateNode(DLLNode node){
        int currFreq=node.freq;
        DLL currList=freqMap.get(currFreq);
        if(currFreq==minFreq && currList.listSize==1){
            minFreq++;
        }
        node.freq++;

        currList.removeNode(node);
        DLL newList=freqMap.getOrDefault(node.freq,new DLL());
        newList.addNode(node);
        freqMap.put(node.freq,newList);
    }
}