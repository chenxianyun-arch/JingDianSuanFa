package com.cxy.linkedtable;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 来源：力扣（LeetCode）
 *  public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) { val = x; }
 *  * }
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {

  //相加算法
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //极端情况，两个链表的头结点都为空，返回null
    if(l1 == null && l2 == null){return null;}
    //进位
    int addOne = 0;
    //设置哑结点
    ListNode dummy = new ListNode(0);
    //head指向dummy，方便移动自己的新的链表
    ListNode head = dummy;
    while( l1 != null || l2 != null || addOne != 0){
      //处理上下数字数量不一致的问题，如果
      int val1 = l1==null ? 0: l1.val;
      int val2 = l2==null ? 0: l2.val;
      int sum = val1 + val2 + addOne;
      head.next = new ListNode(sum%10);
      head = head.next;
      //判 null
      //进位
      addOne = sum / 10;
      if(l1 != null) l1 = l1.next;
      if(l2 != null) l2 = l2.next;
      System.out.println("---");

    }
    return dummy.next;
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
  //内部类
  public static class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
      this.val = val;
    }
  }
  //测试用例l1:(2 -> 4 -> 3) + l2:(5 -> 6 -> 4)
  public static void main(String[] args){
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l1.next = new ListNode(6);
    l1.next.next = new ListNode(4);
    ListNode node = new AddTwoNumbers().addTwoNumbers(l1, l2);
    System.out.println(node);
    String s = new AddTwoNumbers().print(node);
    System.out.println(s);
  }
}
