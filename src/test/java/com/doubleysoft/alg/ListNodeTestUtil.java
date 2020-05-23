package com.doubleysoft.alg;

import org.junit.Assert;

public class ListNodeTestUtil {
    public static void assertEqual(ListNode node1, ListNode node2) {
        while (node1 != null && node2 != null) {
            Assert.assertEquals(node1.val, node2.val);
            node1 = node1.next;
            node2 = node2.next;
        }
        if ((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
            Assert.assertTrue(false);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfStrNum("11", "99"));
        System.out.println(sumOfStrNum("1", "99"));
        System.out.println(sumOfStrNum("0", "1099"));
        System.out.println(sumOfStrNum("11", "1099"));
        System.out.println(sumOfStrNum("9000", "1099"));
    }

    public static String sumOfStrNum(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        StringBuilder sb = new StringBuilder();
        boolean isPre = false;
        int crt = 0;
        String maxStr = len1 < len2 ? str2 : str1;
        String minStr = len1 < len2 ? str1 : str2;
        int minLen = len1 < len2 ? len1 : len2;
        int maxLen = len1 < len2 ? len2 : len1;
        for (int i = minLen - 1; i >= 0; i--) {
            crt = 0;
            //2, 4
            if (isPre) crt++;
            int num1 = Character.digit(minStr.charAt(i), 10);
            //2+1
            int num2 = Character.digit(maxStr.charAt(maxLen - minLen + i), 10);
            crt += num1;
            crt += num2;
            if (crt > 9) {
                isPre = true;
                crt = crt - 10;
            } else {
                isPre = false;
            }
            sb.append(crt);
        }
        // 1 1000
        String rightStr = sb.reverse().toString();

        //补齐剩余的位数
        //11,   04
        String leftStr = maxStr.substring(0, maxLen - minLen > 0 ? (maxLen - minLen) : 0);
        //循环完成后还可能出现进位，单独处理
        if (isPre) {
            if (leftStr.isEmpty()) {
                leftStr = "1";
            } else {
                leftStr = addOne(maxStr, 0, minLen - 1);
            }

        }
        return leftStr + rightStr;
    }

    private static String addOne(String str, int start, int end) {
        if (start < 0) {
            return str;
        }
        boolean isPre = true;
        StringBuilder result = new StringBuilder();
        int tmp = 0;
        for (int i = end; i >= start; i--) {
            tmp = Character.digit(str.charAt(i), 10);
            if (isPre) {
                tmp += 1;
            }
            if (tmp > 9) {
                isPre = true;
                tmp = tmp - 10;
            } else {
                isPre = false;
            }
            result.append(tmp);
        }
        if (isPre) {
            result.append("1");
        }

        return result.reverse().toString();
    }
}
