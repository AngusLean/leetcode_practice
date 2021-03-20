package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class String_91_decodeWaysTest {
    private String_91_decodeWays string_91_decodeWays;
    private List<Tuple<String, Integer>> testData;
    @Before
    public void init(){
        string_91_decodeWays = new String_91_decodeWays();
        testData = new ArrayList<Tuple<String, Integer>>(){{
           add(new Tuple<>("1", 1));
           add(new Tuple<>("12", 2));
           add(new Tuple<>("226", 3));
        }};
    }

    @Test
    public void test(){
        testData.forEach(row -> {
            //System.out.println(row);
            Integer result = string_91_decodeWays.numDecodings(row.getFirst());
            Assert.assertEquals(row.getSecound(), result);
        });
    }
}