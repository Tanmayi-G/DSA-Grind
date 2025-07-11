package Recursion;

import java.util.ArrayList;
import java.util.List;

public class MColoringProblem {
    public boolean graphColoring(int[][] edges, int m, int n) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        int[] colors = new int[n];
        return solve(0, m, n, colors, adj);
    }

    private boolean solve(int node, int m, int n, int[] colors, List<List<Integer>> adj) {
        if (n == node) return true;
        for (int i = 1; i <= m; i++) {
            if (isSafe(i, node, colors, adj)) {
                colors[node] = i;
                if (solve(node + 1, m, n, colors, adj)) return true;
                colors[node] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int col, int node, int[] colors, List<List<Integer>> adj) {
        for (int neighbor : adj.get(node)) {
            if (colors[neighbor] == col) return false;
        }
        return true;
    }
}
