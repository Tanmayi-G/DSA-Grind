package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixMedian {
    public int findMedian(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lst.add(matrix[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get((n * m) / 2);
    }
}
