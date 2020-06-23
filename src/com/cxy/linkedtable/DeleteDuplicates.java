package com.cxy.linkedtable;

public class DeleteDuplicates {

  /**
   * @param head 头结点
   * @return 返回头结点
   */
  public ListNode deleteDuplicates(ListNode head){
    if(head == null)return head;
    ListNode curr = head;
    while (curr != null && curr.next != null){
      if(curr.next.val == curr.val){
        curr.next = curr.next.next;
      }else{
        curr = curr.next;
      }
    }
    return head;
  }
  public static void main(String[] args) {
    DeleteDuplicates duplicates = new DeleteDuplicates();
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(2);
    ListNode listNode = duplicates.deleteDuplicates(l1);
    System.out.println(listNode.toString());
  }
}
