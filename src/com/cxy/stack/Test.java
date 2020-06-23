package com.cxy.stack;

import java.util.HashMap;

public class Test {
  public static void main(String[] args) {
//    HashMap<Character,Character> map = new HashMap<>();
//    //将对应的符号放入map中，前面作为键，后面作为值
//    map.put('(',')');
//    map.put('{','}');
//    map.put('[',']');

    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin());
    minStack.pop();
//    System.out.println(minStack.top());
    System.out.println(minStack.top());
    System.out.println(minStack.getMin());
  }
}
