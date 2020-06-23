package com.cxy.unit1.test;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

public class NumberToBinaryString {
    public static void main(String[] args) {
        //将一个整数N转化成为一个String类型的数据
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数我来将你转化成为二进制String类型");
        int input=scanner.nextInt();
        String s="";
        for(int i=input;i>0;i/=2){
            s=(i%2)+s;
        }
        System.out.println(s);
        String str=Integer.toBinaryString(5);
        System.out.println(str);

    }
}
