package com.cxy.unit1.test;

import java.util.Scanner;

public class ComparisonOfSize {

    /*
    题目：从命令行输入三个参数，如果相等就打印相等，不相等就打印不相等
     */
    public static void main(String[] args) {
        /*while(true) {
        键盘输入判断是否相等
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个参数");
            String str = scanner.nextLine();
            System.out.println("请输入第二个参数");
            String str1 = scanner.nextLine();
            System.out.println("请输入第三个参数");
            String str2 = scanner.nextLine();
            if (str.equals(str1) && str1.equals(str2)) {
                System.out.println("三个参数相等");
            } else {
                System.out.println("三个参数不相等");
            }
        }*/
        /*
        代码规范方面的
        int a=1,b=-1,c = 0;
        if(a<b)
            c=1;
        else c=2;
        System.out.println(c);
         */
        /*
        后一个数是前两个数的和
        int f=0;
        int g=1;
        int sum=0;
        for(int i=0;i<=15;i++){
            System.out.println(f);
            f+=g;
            g=f-g;
            sum+=f;
            System.out.println("这些数的总合为："+sum);
        }

         */




        /*0 1 1 2 3 5 8 13 求第13个数是多少*/
        //方法一
/*      int[] numArr=new int[13];
        numArr[0]=0;
        numArr[1]=1;
        for(int i=2;i<13;++i){
            numArr[i]=numArr[i-1]+numArr[i-2];
        }
        int num13=numArr[12];
        System.out.println(num13);
        */






        }
}
