package com.spark.test.solution03;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Solution {

    /**
     * 返回 无重复字符的最长字串长度
     * 解决方法：（双指针+哈希表)
     * @param s 字符串
     * @return 无重复字符的最长子串的长度
     */
    public int maxSubStrLength(String s){
        boolean[] map = new boolean[128];
        int bns = 0; // 表示最长子串的长度

        for(int i = 0, j = 0; j < s.length(); j++){
            char a = s.charAt(j);
            while(map[a]){
                map[s.charAt(i++)] = false;
            }
            map[a] = true;
            bns = Math.max(bns, j - i + 1);
        }

        return bns;
    }
}
