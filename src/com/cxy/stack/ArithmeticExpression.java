package com.cxy.stack;

import java.util.Scanner;
import java.util.Stack;

public class ArithmeticExpression {

  public static void main(String[] args) {
    System.out.println("请输入一串带（）+数字的算术表达式：例如(1+((2+3)*(4*5)))");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(input);
    //操作符栈
    Stack<String> opertor = new Stack<>();
    //操作数栈
    Stack<Double> number = new Stack<>();
    //保存最终数据的
    double res = 0;
    int index = 0;
    int len = input.length();
    while(len>0){
      //index控制表达式的字符位置
      len--;
      //中间临时保存计算值
      String tempOperator = null;
      char ch = input.charAt(index);
      index++;
      if(ch == '+'|| ch =='-' || ch == '*' || ch == '/' || ch == '('){
        //如果是操作符，
        System.out.println("入操作符栈："+ch);
        opertor.push(Character.toString(ch));
      }else if(ch != ')'){
        System.out.println("入操作数栈："+ch);
        number.push(Double.parseDouble(Character.toString(ch)));
      }else if(ch == ')'){
        //遇到右括号，出操作符栈,并执行相应的number出栈
        System.out.println("遇到右括号");
        tempOperator = opertor.pop();
        //再出一次操作符栈将（括号去掉
        String leftKuo = opertor.pop();
        System.out.println("遇到右括号出栈的字符："+tempOperator);
        System.out.println("将左括号去电"+leftKuo);
        //出第一个number
//        System.out.println("操作数右边的数："+firstNumber);
        if(tempOperator.equals("+")){
          double firstNumber = number.pop();
          double lastNumber = number.pop();
          //计算之后将新得到的数字继续入数字栈
          System.out.println("加号左边出操作数："+lastNumber);
          number.push(lastNumber+firstNumber);
          System.out.println("两边相加的操作数入栈："+lastNumber+firstNumber);
          System.out.println("相加后的栈长度："+number.size());
        }else if(tempOperator.equals("-")){
          //后出栈的减前面的
          double firstNumber = number.pop();
          number.push(number.pop()-firstNumber);
        }else if(tempOperator.equals("*")){
          double firstNumber = number.pop();
          double lastNumber = number.pop();
          System.out.println("乘号右边"+firstNumber);
          System.out.println("乘号左边"+lastNumber);
          number.push(lastNumber*firstNumber);
          System.out.println("相乘的两边的操作数入栈："+firstNumber*lastNumber);
          System.out.println("相乘后的栈长度："+number.size());
        }else if(tempOperator.equals("/")){
          double firstNumber = number.pop();
          //如果分母为0，提示错误
          if(firstNumber == 0){
            System.out.println("分母为0，无法计算");
            break;
          }else
          number.push(number.pop()/firstNumber);
        }
      }
    }
    System.out.println("计算结果为："+number.pop());
  }
}
