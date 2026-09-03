import java.util.*;

class Solution {

    private int find(int ldr[], int node) {
        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }
        return ldr[node];
    }

    private void join(int ldr[], int lt, int rt) {
        ldr[find(ldr, rt)] = find(ldr, lt);
    }

    public int findCircleNum(int[][] g) {

        int n = g.length;
        int[] ldr = new int[n];
        for (int i = 0; i < n; i++) {
            ldr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j)
                    continue;

                if (g[i][j] == 1) {
                    join(ldr, i, j);
                }
            }
        }
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(find(ldr, i));
        }

        return st.size();
    }
}
