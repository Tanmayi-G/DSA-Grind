package StacksAndQueues;

import java.util.HashMap;
import java.util.Map;

class LFU_Cache {
    int capacity;
    int curSize;
    int minFreq;
    Map<Integer,DoublyLinkedList> freqMap;
    Map<Integer,DLLNode> cache;

    public LFU_Cache(int capacity) {
        this.capacity=capacity;
        this.curSize=0;
        this.minFreq=0;
        this.freqMap=new HashMap<>();
        this.cache=new HashMap<>();
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            DLLNode node=cache.get(key);
            updateNode(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(capacity==0) return;
        if(cache.containsKey(key)){
            DLLNode node=cache.get(key);
            node.value=value;
            updateNode(node);
        }
        else{
            if(curSize==capacity){
                //remove lfu then lru
                DoublyLinkedList minFreqList=freqMap.get(minFreq);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                curSize--;
            }
            DLLNode newNode=new DLLNode(key,value);
            DoublyLinkedList curList=freqMap.getOrDefault(1,new DoublyLinkedList());
            curList.addNode(newNode);
            freqMap.put(1,curList);
            cache.put(key,newNode);
            curSize++;
            minFreq=1;
        }
    }

    public void updateNode(DLLNode node){  //handles updation of node and minFreq
        DoublyLinkedList curList=freqMap.get(node.freq);
        curList.removeNode(node);
        if(node.freq==minFreq && curList.listSize==0)
            minFreq++;
        node.freq++;
        DoublyLinkedList newList=freqMap.getOrDefault(node.freq,new DoublyLinkedList());
        newList.addNode(node);
        freqMap.put(node.freq,newList);
    }
}

class DLLNode{
    int key,value,freq;
    DLLNode prev,next;
    public DLLNode(int key,int value){
        this.key=key;
        this.value=value;
        this.freq=1;
    }
}

class DoublyLinkedList{
    int listSize;
    DLLNode head;
    DLLNode tail;
    public DoublyLinkedList(){
        this.listSize=0;
        this.head=new DLLNode(0,0);
        this.tail=new DLLNode(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public void addNode(DLLNode node){
        DLLNode headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
        listSize++;
    }
    public void removeNode(DLLNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        listSize--;
    }
}