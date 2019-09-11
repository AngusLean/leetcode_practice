package com.doubleysoft.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * @see <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
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
