package com.cxy.array;

public class Test {
    public static void main(String[] args) {
        //ArrayOne arrayOne=new ArrayOne();
        //arrayOne.sort();

        //ArrayAverge arr=new ArrayAverge();
        //arr.average();


        /*ArrayCopy arr=new ArrayCopy();
        int [] array=arr.copyArray();
        for(int i:array){
            System.out.print(i);
        }*/
//        ArrayDianDao arr=new ArrayDianDao();
//        char [] array=arr.chArray();
//        System.out.println(array.length);
//        for(char i:array){
//            System.out.print(i);
//        }
        RemoveDuplicates2 removeDuplicates = new RemoveDuplicates2();
        int[] nums = new int[]{1,2,2,3,3,5};
        int res = removeDuplicates.removeDuplicates(nums);
        System.out.println(res);
    }
}
