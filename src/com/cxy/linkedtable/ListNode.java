package com.cxy.linkedtable;


/**
 * 结点类
 */
public class ListNode {
  int val;
  //指向结点指针
  ListNode next;
  //
  public ListNode(int val){
    this.val = val;
  }
  public ListNode(int currData,ListNode next){
    this.val = currData;
    this.next = next;
  }
  public ListNode(){}

  @Override
  public String toString() {
    ListNode head = this;
    StringBuilder s = new StringBuilder();
    while (head != null){
      s.append(head.val+ " ");
      head = head.next;
    }
    return s.toString();
  }
}
