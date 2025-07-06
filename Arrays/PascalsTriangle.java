package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    public List<Integer> generateRow(int row){
        List<Integer> rowList=new ArrayList<>();
        int ans=1;
        rowList.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            rowList.add(ans);
        }
        return rowList;
    }
}
