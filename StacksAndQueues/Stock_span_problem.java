package StacksAndQueues;

import java.util.Stack;

class Pair{
    int val,ind;
    Pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}

class Stock_span_problem {
    Stack<Pair> st=new Stack<>();
    int currInd;

    public Stock_span_problem() {
        st.clear();
        currInd=-1;
    }
    
    public int next(int price) {
        int ans=0;

        currInd++;
        while(!st.isEmpty() && st.peek().val<=price) st.pop();
        int pge=st.isEmpty() ? -1 : st.peek().ind;
        ans=currInd-pge;
        st.push(new Pair(price,currInd));

        return ans;
    }
}