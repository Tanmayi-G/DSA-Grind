package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Asteroid_collisions {
    public int[] asteroidCollision(int[] arr) {
        List<Integer> st=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0) st.add(arr[i]);
            else{
                while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(arr[i])){
                    st.removeLast();
                }
                if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(arr[i])){
                    st.removeLast();
                }else if(st.isEmpty() || st.get(st.size()-1)<0){
                    st.add(arr[i]);
                }
            }
        }

        int[] ans=new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        
        return ans;
    }
}
