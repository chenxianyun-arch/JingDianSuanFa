package com.cxy.stack;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * 思想：每个数字入最小栈的时候先跟栈顶元素进行比较，如果比栈顶元素都小，入数字栈的同时要入最小栈
 */
public class MinStack {
  /** initialize your data structure here. */
  //数字栈
  private Deque<Integer> numStack;
  //最小栈
  private Deque<Integer> minStack;
  public MinStack() {
    //在调用构造函数的时候才进行对象的初始化
    numStack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }

  public void push(int x) {
    //每个数字入最小栈的时候先跟栈顶元素进行比较，如果比栈顶元素都小，入数字栈的同时要入最小栈
    numStack.push(x);
    if(minStack.size() ==0 || minStack.peek()>=x){
      minStack.push(x);
    }
  }

  public void pop() {
    //查看栈顶元素
    //弹出栈顶元素,numStack出栈的元素minStack栈顶元素一致时，minStack栈顶元素也要出栈
    int numPop = numStack.pop();
    if(numPop == minStack.peek()){
      minStack.pop();
    }
  }

  public int top() {
   return numStack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
