package com.doubleysoft.alg.leetcode.strings;

public class String_91_decodeWays {
    /**
     * 状态转移方程:
     * dp[0] = 1, 为了建立方程
     * dp[1]=s.charAt(0) == '0' ? 0 : 1
     * @param s
     * @return
     */
    public int numDecodings(String s) {
       if(s == null || s.length() == 0){
           return 0;
       }
       int n = s.length();
       int[] res = new int[n+1];
       res[0] = s.charAt(0) != '0' ? 1 : 0;
       for (int i=1; i<n; i++){
           int first = Integer.valueOf(s.substring(i, i+1));
           int second = Integer.valueOf(s.substring(i-1, i+1));
           if(0 < first && first <= 9){
               res[i] += res[i-1];
           }
           if(second >= 10 && second <= 26){
               res[i] += i >= 2 ? res[i-2] : 1;
           }
       }
       return res[n-1];
    }


}
