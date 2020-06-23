package com.cxy.array;

public class RemoveElement2 {
  public int removeElement(int[] nums,int val){
    if(nums.length==0||nums==null){return 0;}
    int i = 0;
    for(int j=0;j<nums.length;j++){
      if(nums[j] != val){
        nums[i] = nums[j];
        i++;
      }
    }
    for(int k:nums){
      System.out.println(k);
    }
    return i;
  }
  public static void main(String[] args) {
    RemoveElement2 element = new RemoveElement2();
    int[] arr = new int[]{0,1,2,2,3,0,4,2};
    int i = element.removeElement(arr, 2);
    System.out.println(i);
  }
}
