package Recursion;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(f(0,i,j,board,word)) return true;
                }
            }
        }
        return false;
    }
    
    boolean f(int ind,int i,int j,char[][] board,String word){
        if(ind==word.length()) return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='.' || board[i][j]!=word.charAt(ind)) return false;

        char temp=board[i][j];
        board[i][j]='.';
        boolean top=f(ind+1,i-1,j,board,word);
        boolean bottom=f(ind+1,i+1,j,board,word);
        boolean left=f(ind+1,i,j-1,board,word);
        boolean right=f(ind+1,i,j+1,board,word);

        board[i][j]=temp;

        return (top || bottom || left || right);
    }
}
