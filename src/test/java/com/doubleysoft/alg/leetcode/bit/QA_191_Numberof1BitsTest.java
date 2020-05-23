package com.doubleysoft.alg.leetcode.bit;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_191_Numberof1BitsTest {
    private List<Tuple<Integer, Integer>> testData;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<Integer, Integer>>() {{
            //00000000000000000000000010000000
            add(new Tuple<>(128, 1));
            //00000000000000000000000000001011
            add(new Tuple<>(11, 3));
        }};
    }

    @Test
    public void hammingWeight() {
        testData.forEach(row -> {
            int result = QA_191_Numberof1Bits.hammingWeight(row.getFirst());
            Assert.assertEquals(row.getSecound().intValue(), result);
        });
    }
}