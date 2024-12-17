package com.spark.test.solution02;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {}
    public ListNode(int val) {this.val = val;}
    public ListNode(int val, ListNode node){this.val = val; this.next = node;}

    public int getVal() {
        return val;
    }
    public ListNode getNext(){
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public void setVal(int val) {
        this.val = val;
    }
}