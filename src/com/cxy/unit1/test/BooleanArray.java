package com.cxy.unit1.test;

public class BooleanArray {
    public static void main(String[] args) {
        //二维boolean 数组循环添加和打印行号和列号
        boolean [][] booleans=new boolean[][]{{true,false}, {false,true}};
        for(int i=0;i<booleans.length;i++){
            for(int j=0;j<booleans[i].length;++j){
                if(booleans[i][j]==true){
                    System.out.println("*");
                }else {
                    System.out.println(" ");
                }
            }
        }
    }
}
