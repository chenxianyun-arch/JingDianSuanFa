package com.cxy.unit1.test;

public class MathB {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<1000;i++){
            for (int j=0;j<i;j++){
                sum++;
                System.out.println(sum);
                System.out.println("i="+i);
            }
        }
    }
}
