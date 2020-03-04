package com.doubleysoft.alg.leetcode.strings;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * Explanation: This is the base case.
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 * Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", "2" can be read as "12" which means frequency = 1 and value = 2, the same way "1" is read as "11", so the answer is the concatenation of "12" and "11" which is "1211".
 *
 * @see <a href="https://leetcode.com/problems/count-and-say/">38. Count and Say</a>
 * 此题的核心是理解题意：
 * 1 -> 1
 * 2 -> 11  看它上一个数字，为1个2
 * 3 -> 21  看它上一个数字，为2个1
 * 4 -> 1211  看它上一个数字，为1个2,1个1.
 * <p>
 * 以此类推。 递归处理
 */
public class String_38_CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] ch = countAndSay(n - 1).toCharArray();
        //注意这里count初始化为0， 因为是在字符数组的下一位才计算上一位的。所以循环的初始值给0
        int count = 0;
        char prev = ch[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (prev != ch[i]) {
                //这里处理2个1， 1个1这种逻辑
                sb.append(count).append(prev);
                prev = ch[i];
                count = 1;
            } else {
                count++;
            }
        }
        //循环完成过后最后一个字符还没有处理
        sb.append(count).append(String.valueOf(prev));
        return sb.toString();
    }
}
