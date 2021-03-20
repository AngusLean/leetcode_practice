package com.doubleysoft.alg;

interface Chinese {

}


public class HJK {
    private static int result = Integer.MAX_VALUE;
    private Boolean Paddy;

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};

        //System.out.println(shortestRoad(arr));
    }

    public static int shortestRoad(int arr[][]) {
        int dp[][] = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
            //第一列只能由上向下
        }
        for (int j = 1; j < arr[0].length; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
            //第一行只能由左向右
        }
        for (int i = 1; i < arr.length; i++)
            for (int j = 1; j < arr[0].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }

        return dp[arr.length - 1][arr[0].length - 1];
    }

    public static void dfs(int[][] data, int rows, int cols, int x, int y, int count, boolean[][] flag) {
        if (x == rows - 1 && y == cols - 1) {
            result = min(count, result);
            return;
        }
        if (x < 0 || x >= rows || y < 0 || y >= cols || data[x][y] == 0 || flag[x][y] == true) {
            return;
        }
        flag[x][y] = true;
        dfs(data, rows, cols, x - 1, y, count + 1, flag);
        dfs(data, rows, cols, x + 1, y, count + 1, flag);
        dfs(data, rows, cols, x, y - 1, count + 1, flag);
        dfs(data, rows, cols, x, y + 1, count + 1, flag);
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
