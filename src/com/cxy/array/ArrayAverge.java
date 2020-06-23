package com.cxy.array;

public class ArrayAverge {
    double [] array=new double[]{1.2,1.2,5.3};
    public void average(){
        double sum=0;
        int i=0;
        while(true){

            double arverage;
            sum+=array[i++];
            arverage=sum/array.length;
            System.out.println("平均长度为"+arverage);
            System.out.println(i);
            if(i>2){
                break;
            }
        }
    }
}
