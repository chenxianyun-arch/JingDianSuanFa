package com.cxy.test;

public class Modefier {

  //权限修饰符，protected本包以及子类可以使用
  protected void sayHello(){
    System.out.println("你好啊！");
  }
  protected void callSayHello(){
    this.sayHello();
  }
}
