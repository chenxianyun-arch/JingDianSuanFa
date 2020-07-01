package com.cxy.linkedtable;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseSLList {

  public ListNode reverseList(ListNode head) {
    //采用递归调用的方式进行反转，不要在乎内部的细节，关注如下几点
    //    1.递归的终止条件：交换两个节点，如果只有一个节点或者是没有节点就可以停止了。
    //    2.本级递归需要给下级递归传递什么：给下级传递的就是当前结点的下一个节点
    //    3.本次递归做什么： 本次递归需要交换两个节点。
    if(head == null || head.next == null){
      return head;
    }
    //移动指针指向
    ListNode res = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return res;
  }

  public static void main(String[] args) {

    ReverseSLList slList = new ReverseSLList();
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    ListNode node = slList.reverseList(l1);
    System.out.println(node.toString());
  }
}
