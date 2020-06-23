package com.cxy.array;


public class ArrayDianDao {
    char [] chars=new char[]{'你','我','他','她'};
    public char[] chArray(){
        char [] newChars=new char[chars.length];
        for(int i=0;i<chars.length/2;i++){
            char temp=chars[i];
            newChars[i]=chars[chars.length-1-i];
            newChars[chars.length-1-i]=temp;


        }
        return newChars;
    }
}
