package com.spark.test.utils;

import com.spark.test.solution02.ListNode;

public class ListNodeUtils {

    /**
     * 传入一个int数类型数组（线性表），按照顺序生成链表节点
     * @return ListNode链表节点
     */
    public static ListNode generateListNode(int[] arr){
        ListNode dummy = new ListNode(arr[0]);
        ListNode cur = dummy;

        for(int i = 1; i < arr.length; i++){
            cur.setNext(new ListNode(arr[i]));
            cur = cur.getNext();
        }

        return dummy;
    }

    /**
     * 遍历链表
     * @param listNode 链表节点
     */
    public static void printListNode(ListNode listNode){
        while (listNode != null){
            System.out.print(listNode.getVal() + (listNode.getNext() != null ? "," : ""));
            listNode = listNode.getNext();
        }
    }
}
