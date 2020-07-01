package com.cxy.stack;

import com.cxy.linkedtable.ListNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PaliLinkedList {

  //创建一个栈来保存这个链表
  Stack<Integer> stack = new Stack();
  public boolean isPalindrome(ListNode head) {
    //将链表元素全部push进入栈中
    if(head.next ==null)return false;
    if(head ==null){return true;}
    push(head);
    boolean b = isValid(head);
    return b;
  }

  /**
   * 将链表元素放入到栈中
   * @param head
   * @return
   */
  private Stack<Integer> push(ListNode head){
    while (head != null){
      stack.push(head.val);
      head = head.next;
    }
    return stack;
  }

  /**
   * 判断是否有效，返回真正的真正的结果
   * @param head
   * @return
   */
  private boolean isValid(ListNode head){
    while (!stack.isEmpty()){
      if(head.val != stack.pop()){
        return false;
      }
      head = head.next;
    }
    return true;
  }

  public static void main(String[] args) {
    ListNode l1 = null;
//    l1.next = new ListNode(2);
//    l1.next.next = new ListNode(1);
    PaliLinkedList list = new PaliLinkedList();
    boolean isPalin = list.isPalindrome(l1);
    System.out.println(isPalin);
  }
}
