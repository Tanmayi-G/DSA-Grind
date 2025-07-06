package LinkedLists;

public class FlatteningLL {
    class Node{
	    int data;
	    Node next;
	    Node bottom;
	
    	Node(int d){
	    	data = d;
		    next = null;
		    bottom = null;
	    }
    }

    Node flatten(Node root){
	    if(root==null || root.next==null) return root;
	    Node mergedHead=flatten(root.next);
	    return flatten2(root,mergedHead);
	    
    }

    Node flatten2(Node l1,Node l2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                temp.bottom=l1;
                l1=l1.bottom;
            }
            else{
                temp.bottom=l2;
                l2=l2.bottom;
            }
            temp.next=null;
            temp=temp.bottom;
        }
        if(l1!=null) temp.bottom=l1;
        else temp.bottom=l2;
        
        return dummy.bottom;
    }
}
