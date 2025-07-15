package StacksAndQueues;

public class Celebrity_problem {
    public int celebrity(int[][] mat) {
        int n=mat.length;
        int top=0; int bottom=n-1;
        while(top<bottom){
            if(mat[top][bottom]==1){
                top++;
            }else{
                bottom--;
            }
        }
        if(top>bottom) return -1;
        
        for(int i=0;i<n;i++){
            if(i==top) continue;
            
            if(mat[i][top]==1 && mat[top][i]==0) continue;
            else return -1;
        }
        
        return top;
    }
}
