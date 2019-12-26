package com.doubleysoft.alg.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * <p>
 * Input: "III"
 * Output: 3
 * Example 2:
 * <p>
 * Input: "IV"
 * Output: 4
 * Example 3:
 * <p>
 * Input: "IX"
 * Output: 9
 * Example 4:
 * <p>
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * <p>
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 */
public class String_13_RomantoInteger {
    private static final Map<String, Integer> romanMap;

    static {
        romanMap = new HashMap();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
    }

    //严格遵循标准的罗马数字格式，即前后数字的联系
    public int romanToInt(String s) {
        int len = s.length();
        String pre = null;
        int i = 0;
        int result = 0;
        for (i = 0; i < len; i++) {
            String ch = s.substring(i, i + 1);
            int crt = getNumBySingleRoman(ch);
            if (pre != null) {
                if (isSubtract(pre, ch)) {
                    result += crt - 2 * getNumBySingleRoman(pre);
                } else {
                    result += crt;
                }
            } else {
                result += crt;
            }
            pre = ch;
        }
        return result;
    }

    //非严格准守罗马数字标准
    public int romanToInt1(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            int crtNum = getNumBySingleRoman(s.substring(i, i + 1));
            if (i == len - 1) {
                result += crtNum;
            } else {
                if (crtNum < getNumBySingleRoman(s.substring(i + 1, i + 2))) {
                    result -= crtNum;
                } else {
                    result += crtNum;
                }
            }
        }
        return result;
    }

    private boolean isSubtract(String left, String right) {
        if ("I".equals(left)) {
            return "V".equals(right) || "X".equals(right);
        }
        if ("X".equals(left)) {
            return "L".equals(right) || "C".equals(right);
        }
        if ("C".equals(left)) {
            return "D".equals(right) || "M".equals(right);
        }
        return false;
    }

    private int getNumBySingleRoman(String ro) {
        if (!romanMap.containsKey(ro)) {
            throw new IllegalArgumentException();
        }
        return romanMap.get(ro);
    }
}
