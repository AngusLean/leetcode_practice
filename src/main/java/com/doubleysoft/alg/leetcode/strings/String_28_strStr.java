package com.doubleysoft.alg.leetcode.strings;

/**
 * @see <a href="https://leetcode.com/problems/implement-strstr/submissions/">28. Implement strStr()</a>
 * 注意几点：
 * 1. 对于字符串为null, 或者两边为空的情况的处理
 * 2. 左边字符串长度小于右边的时候
 * 3. 左边字符串已经匹配到了末尾，右边字符串还没有匹配完成的情况
 */
public class String_28_strStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        } else if (needle.length() == 0) {
            return 0;
        }
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) {
            return -1;
        }
        int j = 0;
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                boolean contain = true;
                while (j < len2) {
                    //左边字符串已经匹配到末端了还没有匹配完 或者说 当前位置的字符不相等
                    if (i + j >= len1 || haystack.charAt(i + j) != needle.charAt(j)) {
                        contain = false;
                        break;
                    }
                    j++;
                }
                if (contain) {
                    return i;
                }
            }
            j = 0;
        }
        return -1;
    }
}
