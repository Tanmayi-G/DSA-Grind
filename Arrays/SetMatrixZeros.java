package Arrays;

public class SetMatrixZeros {
    public void setZeroes(int[][] mat) {
        int n=mat.length; //number of rows
        int m=mat[0].length; //number of cols
        int col0=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    if(j==0) col0=0;
                    else mat[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=0){
                    if(mat[i][0]==0 || mat[0][j]==0) mat[i][j]=0;
                }
            }
        }

        if(mat[0][0]==0){
            for(int j=1;j<m;j++) mat[0][j]=0;
        }

        if(col0==0){
            for(int i=0;i<n;i++) mat[i][0]=0;
        }
    }
}
