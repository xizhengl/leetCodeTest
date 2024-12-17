package com.spark.test.solution02;

/**
 * 两数之和
 * 题目： 给你两个非空链表，表示非负整数，它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同的形式返回一个链表。
 * 你可以假设除了数字0之外，这两个数都不会以0开头。
 *
 * 示例1：
 * input: [2,4,3], [5,6,4]
 * output: [8,0,7]
 * 解释 243 + 564 = 907.
 *
 * 示例2：
 * input: [0], [0]
 * output: [0]
 *
 * 示例3：
 * input: [9,9,9,9,9,9,9], [9,9,9,9]
 * output: [8,9,9,9,0,0,0,1]
 */
public class Solution {
    /**
     * 给定两个链表 返回两数相加后处理后的链表
     * 解决方法： 模拟
     * @param l1 链表1
     * @param l2 链表2
     * @return 两数相加后的链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode cur = dummy;

        while(l1 != null || l2 != null || carry != 0){
           int s = (l1 == null ? 0 : l1.getVal()) + (l2 == null ? 0 : l2.getVal()) + carry;
           carry = s / 10;
           cur.setNext(new ListNode(s % 10));
           cur = cur.getNext();
           l1 = l1 == null ? null : l1.getNext();
           l2 = l2 == null ? null : l2.getNext();
        }

        return dummy.getNext();
    }
}


