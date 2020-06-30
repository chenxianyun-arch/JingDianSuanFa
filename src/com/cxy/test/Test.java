package com.cxy.test;

public class Test {
  public static void main(String[] args) {
    Modefier modefier = new Modefier();
    modefier.callSayHello();
  }

  public int sumNumber(int n) {
    //return (int)(1+n)*n/2;
    int sum = n;
    //后面的sum+=sumNumber()递归调用的只可能是正数，当n=0时候不满足条件了，逐层进行调用得到结果
    boolean flag = n > 0 && (sum += sumNumber(n - 1)) > 0;
    return sum;
  }
}

