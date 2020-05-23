package com.doubleysoft.alg.leetcode.stack.Stack_20;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongyang.yu
 * dongyang.yu@anxincloud.com
 */
public class Stack_ValidParenthesesTest {
    private List<Tuple<String, Boolean>> testData;
    private Stack_ValidParentheses stack_validParentheses;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<String, Boolean>>() {{
            add(new Tuple<>("()", true));
            add(new Tuple<>("[]", true));
            add(new Tuple<>("{}", true));
            add(new Tuple<>("}", false));
            add(new Tuple<>(")", false));
            add(new Tuple<>("(}", false));
            add(new Tuple<>("(]", false));
            add(new Tuple<>("[", false));
            add(new Tuple<>("", true));
        }};
        stack_validParentheses = new Stack_ValidParentheses();
    }

    @Test
    public void isValid() {
        testData.forEach(row -> {
            //System.out.println("开始测试: " + row);
            Assert.assertEquals(row.getSecound(), stack_validParentheses.isValid(row.getFirst()));
        });
    }
}