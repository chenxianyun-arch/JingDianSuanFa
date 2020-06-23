package com.cxy.linkedtable;


public class MergTwoLTable {
  public ListNode mergeTwoLists(ListNode l1,ListNode l2){
    //创建一个哑结点()
    ListNode dummp = new ListNode(-1);
    ListNode curr = dummp;
    if(l1 == null){return l2;}
    if(l2 == null){return l1;}
    while(l1 != null && l2 != null){
      if(l1.val < l2.val){
        curr.next = new ListNode(l1.val);
        //移动l1,指向下一个结点
        l1 = l1.next;
      }else {
        curr.next = new ListNode(l2.val);
        l2 = l2.next;
      }
      //移动当前指针到下一个结点
      curr = curr.next;
    }
    if(l1 == null){curr.next = l2;}
    if(l2 == null){curr.next = l1;}
    return dummp.next;
  }

  public static void main(String[] args) {
    MergTwoLTable lTable = new MergTwoLTable();
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);
    ListNode node = lTable.mergeTwoLists(l1, l2);
    System.out.println(node.toString());
  }

}
