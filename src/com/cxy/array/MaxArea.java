package com.cxy.array;

public class MaxArea {
  public static int maxArea() {
    int[] height = new int[]{1,8,6,2,5,4,8,3,7};
    int res = 0;
    for(int i=0; i<height.length; i++){
      int first = height[i];
      for(int j=i+1; j<height.length; j++){
        int width = j-i;
        int next = height[j];
        int minHeight = Math.min(first,next);
        res = Math.max(minHeight*width,res);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int i = MaxArea.maxArea();
    System.out.println(i);
  }
}
