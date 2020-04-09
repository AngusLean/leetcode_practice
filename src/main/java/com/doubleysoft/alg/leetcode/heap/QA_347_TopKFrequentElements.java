package com.doubleysoft.alg.leetcode.heap;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * Note:
 * <p>
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/">347. Top K Frequent Elements</a>
 */
public class QA_347_TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        int length = nums.length;

        Map<Integer, Integer> countMap = new HashMap<>(1, length);
        for (int i = 0; i < length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(k, Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (maxHeap.size() != k) {
                maxHeap.offer(entry);
            } else if (maxHeap.peek().getValue() < entry.getValue()) {
                maxHeap.poll();
                maxHeap.offer(entry);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> num : maxHeap) {
            result.add(num.getKey());
        }
        return result;
    }

    public static List<Integer> topKFrequent1(int[] nums, int k) {
        int length = nums.length;
        List<Integer>[] sortedNums = new List[length + 1];

        Map<Integer, Integer> countMap = new HashMap<>(1, length);
        for (int i = 0; i < length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (sortedNums[entry.getValue()] == null) {
                sortedNums[entry.getValue()] = new ArrayList<>();
            }
            sortedNums[entry.getValue()].add(entry.getKey());
        }

        List<Integer> result = new ArrayList<>();
        int mask = k;
        for (int i = sortedNums.length - 1; i >= 0 && mask > 0; i--) {
            if (sortedNums[i] != null) {
                mask--;
                result.addAll(sortedNums[i]);
            }
        }
        return result;
    }
}
