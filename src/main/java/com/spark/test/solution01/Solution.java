package com.spark.test.solution01;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class Solution {

    /**
     * 计算两数之和的索引位置
     * 解决方法：（哈希表） 输入规模：n： 时间复杂度：O(n)
     * @param nums 整型数组
     * @param target 目标数字
     * @return 数组中对应索引数组
     */
    public int[] addTowNumbers(int[] nums, int target){
        // key存值, val数组中对应的索引位置
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;; i++){
            int val = nums[i];
            int n = target - nums[i];
            if(map.containsKey(n)){
                return new int[]{i, map.get(n)};
            }
            map.put(val, i);
        }
    }
}
