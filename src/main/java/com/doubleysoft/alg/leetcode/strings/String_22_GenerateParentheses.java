package com.doubleysoft.alg.leetcode.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a>
 */
public class String_22_GenerateParentheses {
    private List<String> result = new ArrayList<>();
    //(在左边的总数
    private int leftTotal = 0;
    //(在左边还未被匹配的数量
    private int leftRemain = 0;

    public List<String> generateParenthesis(int n) {
        leftTotal = 1;
        leftRemain = 1;
        generateParenthesis(n * 2, 1, new ArrayList<Character>() {{
            add('(');
        }});
        return result;
    }

    public void generateParenthesis(int total, int idx, List<Character> strs) {
        if (strs.size() == total) {
            result.add(strs.stream().map(String::valueOf).collect(Collectors.joining()));
        } else {
            for (int i = idx; i < total; i++) {
                int last = strs.size();
                if (leftTotal >= total / 2 || leftRemain == 0) {
                    strs.add(')');
                    generateParenthesis(total, i + 1, strs);
                    strs.remove(last);
                } else {
                    strs.add('(');
                    leftTotal++;
                    leftRemain++;
                    generateParenthesis(total, i + 1, strs);
                    strs.remove(last);

                    strs.add(')');
                    leftRemain--;
                    generateParenthesis(total, i + 1, strs);
                    strs.remove(last);
                }
            }
        }
    }
}
