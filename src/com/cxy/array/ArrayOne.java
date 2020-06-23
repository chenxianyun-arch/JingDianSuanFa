package com.cxy.array;

public class ArrayOne {

    double [] arr=new double[]{1.1,2.1,4.2,6.2,1.3};
    //find the big number in arr
    double temp=arr[0];

    public void sort(){
        for(int i=0;i<arr.length;++i){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println("数组中最大的值为："+temp);
    }



}

