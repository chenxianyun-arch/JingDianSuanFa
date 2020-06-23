package com.cxy.javareview.classes;

public class SubClass1{

  public static  void getMsg(){
    System.out.println("调用了静态方法");
  }
  public static void main(String[] args) {
    SubClass1.getMsg();
  }
}
