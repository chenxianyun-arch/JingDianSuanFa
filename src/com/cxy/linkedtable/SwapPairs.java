package com.cxy.linkedtable;

public class SwapPairs {
  public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null){return head;}
    ListNode next = head.next;
    next.next = head;
    head.next = swapPairs(next.next);
    return head;
  }

  //内部类
  public static class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
      this.val = val;
    }
    //打印方法
    public String print(ListNode test){
      StringBuilder sb = new StringBuilder();
      while (test.next != null){
        sb.append(test.val +"-->");
        test = test.next;
      }
      return sb.toString();
    }
  }
  //测试用例l1:给定 1->2->3->4, 你应该返回 2->1->4->3.
  public static void main(String[] args){
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
  }
}
