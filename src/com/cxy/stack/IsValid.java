package com.cxy.stack;

import org.hamcrest.core.Is;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class IsValid {

  public boolean isValid(@NotNull String s) {
    HashMap<Character,Character> map = new HashMap<>();
    //将对应的符号放入map中，前面作为键，后面作为值
    map.put(')','(');
    map.put('}','{');
    map.put(']','[');
    Deque<Character> stack = new ArrayDeque<>();
//    Stack<Character> stack = new Stack<>();
    if(s.length()==0 || s==null){return true;}
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
        stack.push(s.charAt(i));
      }else if(map.get(s.charAt(i)) == stack.peek()){
        //如果下次循环的值作为键，得到的值跟栈顶元素相同，就让栈顶元素出栈
        System.out.println("栈顶元素为："+stack.peek());
        stack.pop();
      }else{
        return false;
      }
    }
    return stack.isEmpty();
  }


  public static void main(String[] args) {
    System.out.println("输入字符串：()[]{}");
    Scanner sc = new Scanner(System.in);
    String nextLine = sc.nextLine();
    IsValid isValid = new IsValid();
    boolean valid = isValid.isValid(nextLine);
    System.out.println(valid);
  }
}
