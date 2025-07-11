package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            board.add(".".repeat(n));
        }
        f(0,board,ans,n);
        return ans;
    }
    //f(colInd,[],n)
    void f(int colInd,List<String> board,List<List<String>> ans,int n){
        if(colInd==n){
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int row=0;row<n;row++){
            if(!canPlace(row,colInd,board,n)) continue;

            char[] strArr=board.get(row).toCharArray();
            strArr[colInd]='Q';
            board.set(row,new String(strArr));
            f(colInd+1,board,ans,n);

            strArr[colInd]='.';
            board.set(row,new String(strArr));
        }
    }

    boolean canPlace(int row,int col,List<String> board,int n){
        int i=row; int j=col;
        while(j>=0){
            if(board.get(i).charAt(j)=='Q') return false;
            j--;
        }

        i=row; j=col;
        while(i>=0 && j>=0){
            if(board.get(i).charAt(j)=='Q') return false;
            i--; j--;
        }

        i=row; j=col;
        while(i<n && j>=0){
            if(board.get(i).charAt(j)=='Q') return false;
            i++; j--;
        }

        return true;      
    }
}
}
