package com.cxy.test;

public class DiGui {


  public static void main(String[] args) {
    DiGui diGui = new DiGui();
    diGui.sayHello(5);
  }

  private void sayHello(int i) {
    i--;
    if (i > 0) {
      sayHello(i);
      System.out.println("第 " + i + "次调用");
    }
  }
}
