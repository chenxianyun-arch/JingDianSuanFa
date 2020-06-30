package com.cxy.test;

public class SpecialModefier {
  private final int a;

  private final String str = "123";

  public SpecialModefier(int a) {
    this.a = a;
  }

  public static void main(String[] args) {
    SpecialModefier modefier = new SpecialModefier(2);
    System.out.println(modefier.a);
    System.out.println(modefier.str);
    String newStr = "456";
  }
}
