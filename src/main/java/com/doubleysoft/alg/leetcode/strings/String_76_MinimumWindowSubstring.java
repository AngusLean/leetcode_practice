package com.doubleysoft.alg.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class String_76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s == null || t == null){
            return null;
        }
        int targetLen = t.length();
        int sourceLen = s.length();
        int right = 0;
        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        int valid = 0;
        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<targetLen; i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0)+1);
        }
        while(right < sourceLen){
            Character r = s.charAt(right);
            right++;
            if(need.containsKey(r)){
                window.put(r, window.getOrDefault(r, 0)+1);
                if(window.get(r).equals(need.get(r))){
                    valid++;
                }
            }
            while(valid == need.size()){
                if(right - left < minLen){
                    start = left;
                    minLen = right-left;
                }
                Character l = s.charAt(left);
                left++;
                if(need.containsKey(l)){
                    if(window.get(l).equals(need.get(l))){
                        valid--;
                    }
                    window.put(l, window.get(l)-1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, minLen+start);
    }

    public static void main(String[] args) {

    }
}
