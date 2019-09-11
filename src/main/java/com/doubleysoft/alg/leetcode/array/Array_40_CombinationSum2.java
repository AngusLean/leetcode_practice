package com.doubleysoft.alg.leetcode.array;

import java.util.*;

/**
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 *
 * @see <a href="https://leetcode.com/problems/combination-sum-ii/">40. Combination Sum II</a>
 */
public class Array_40_CombinationSum2 {
    private Map<List<Integer>, Boolean> markedPath = new HashMap<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        System.out.println("=====================================================");
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(result, new ArrayList<>(), 0, candidates, target);
        System.out.println(result);
        return result;
    }

    private void combinationSum(List<List<Integer>> result, List<Integer> path, int index, int[] candidates, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            checkIsDepulcateArr(result, path);
            return;
        }
        if (index >= candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> temp = new ArrayList<>(path);
            temp.add(candidates[i]);
            combinationSum(result, temp, i + 1, candidates, target - candidates[i]);
        }
    }

    private void checkIsDepulcateArr(List<List<Integer>> result, List<Integer> path) {
        Collections.sort(path);
        boolean isMarked = false;
        if (!markedPath.isEmpty()) {
            for (List<Integer> integerList : markedPath.keySet()) {
                if (isEqualList(integerList, path)) {
                    isMarked = true;
                    break;
                }
            }
        }
        if (!isMarked) {
            result.add(path);
            markedPath.put(path, Boolean.TRUE);
        }
    }

    private boolean isEqualList(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        int len = list1.size();
        for (int i = 0; i < len; i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
