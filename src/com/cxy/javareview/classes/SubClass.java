package com.cxy.javareview.classes;

public final class SubClass implements Hero {

  private int size;
  public SubClass(){}
  public SubClass(int a){}

  @Override
  public int growUp() {
    return 1111;
  }

  @Override
  public int attck() {
    return 2222;
  }
}
