package com.doubleysoft.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cupofish@gmail.com
 * 9/10/19 22:48
 */
public class Array_39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        System.out.println("=====================================================");
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(result, new ArrayList<>(), 0, candidates, target);
        return result;
    }

    private void combinationSum(List<List<Integer>> result, List<Integer> path, int index, int[] candidates, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(path);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            System.out.println(String.format("开始第%d次循环，内循环为:%d.　当前结果为%s", i, index, path.toString()));
            List<Integer> temp = new ArrayList<>(path);
            temp.add(candidates[i]);
            combinationSum(result, temp, i, candidates, target - candidates[i]);
            System.out.println("+++++++++++++++++");
        }
    }
}
