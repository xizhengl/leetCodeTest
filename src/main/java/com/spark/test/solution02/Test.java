package com.spark.test.solution02;

import com.spark.test.utils.ListNodeUtils;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNodeUtils.generateListNode(new int[]{2, 4, 3});
        ListNode l2 = ListNodeUtils.generateListNode(new int[]{5, 6, 4});
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        ListNodeUtils.printListNode(listNode);
    }
}
