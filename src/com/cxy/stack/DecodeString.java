package com.cxy.stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class DecodeString {

  public static void main(String[] args) {
    System.out.println("请输入类似于这样的字符串：3[a]2[bc] 或者 3[a2[c]] 我将会帮你进行解码");
    Scanner sc= new Scanner(System.in);
    String input = sc.nextLine();
    //数字栈
    Stack<Integer> number = new Stack<>();
    //字符栈
    Stack<String> content = new Stack<>();
    //处理倍数匹配的正则表达式匹配值
    Pattern pattern = Pattern.compile("[0-9]*");
    int tempInt = 0;
    int result1 = 0;
    //解析字符串的过程
    for(int i=0;i<input.length();i++){
      //获取到指定位置的char值
      char ch = input.charAt(i);
      //转化成指定的String类型，方便后面转化成为数字
      String chStr = Character.toString(ch);
      //如果是字符或者是[就进行入栈操作
      if(Character.isLetter(ch) || ch=='['){
        //如果紧挨着两个字符，就要将这两个字符组成一个字符串再入栈
        //是字母就入字符栈
        System.out.println("-----入内容栈----");
        content.push(Character.toString(ch));
      }
      else if(pattern.matcher(chStr).matches()){
        //满足是一个数字,这里因为是一个字符一个字符入的，像10这种整数，就会被拆分成1,0这两个字符，为了避免这种情况
        //可以判断下一个是否是数字，是的话，上次就不入数字栈，将这次的数字保存下来
        if(pattern.matcher(Character.toString(input.charAt(++i))).matches()){
          //一直加到它不是数字为止
          //先将第一位进行保存
          tempInt = Integer.parseInt(chStr);
          //例如10，第一位为1,1*10+0，第一位*10+第二位
          //100,就是1*10+0=10   10*10+0=100
          tempInt = tempInt*10 + Integer.parseInt(Character.toString(input.charAt(++i)));
          number.push(tempInt);
        }else if(!pattern.matcher(Character.toString(input.charAt(++i))).matches()){
          System.out.println("入栈为："+tempInt);
          //下一个不是数字了就将转化的数字入栈
          tempInt = Integer.parseInt(chStr);
          number.push(tempInt);
        }else {
//          number.push(Integer.parseInt(chStr));
        }
      }else if(ch == ']'){
          //字符出栈,一直出到遇到[括号为止
          String popStr = "";
          String popAllCh = "";
          while(true){
//            popStr = content.pop();
            System.out.println("栈的内容为"+content.toString());
            System.out.println("while循环里面出来的"+popStr);
            if(popStr.equals("[")){
              break;
            }else {
              popAllCh = popAllCh.concat(popStr);
              System.out.println("popAllCh:"+popAllCh);
              System.out.println(content.peek());
            }
          }
          popAllCh=new StringBuffer(popAllCh).reverse().toString();
          //对新得到的字符串进行入栈操作
          content.push(popAllCh);
          System.out.println("连续的字符串为"+popAllCh);
          System.out.println("出栈的字符/字符串为："+popStr);
          //数字出栈
          Integer popInt = number.pop();
          System.out.println("倍数出栈为："+popInt);
          //将倍数与字符进行重新拼接
          //判断字符栈不为空就要把前面的字符加在这个newStr之前
          String newStr = "";
          String contentStr = "";
          if(!content.isEmpty()){
            newStr=content.pop();
          }else {
            newStr = "";
          }
          while((popInt--)>0){
            contentStr = contentStr.concat(newStr);
            System.out.println("拼接的第"+popInt+"次结果："+contentStr);
          }
          //再次进行入内容栈
          content.push(contentStr);
          System.out.println("入栈的长字符串为："+contentStr);
        }
    }
    //遍历循环输出栈中的字符
    System.out.println("字符栈大小为"+content.size());
    String res = "";
    String result = "";
    while(content.size()>0){
      result = content.pop()+result;
    }
    System.out.println("结果为"+result);
  }
}
