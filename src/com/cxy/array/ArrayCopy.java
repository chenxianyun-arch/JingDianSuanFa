package com.cxy.array;

public class ArrayCopy {

    int [] array=new int[]{1,2,1,2,3};

    public int[] copyArray(){
        int [] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        return newArray;
    }
}
