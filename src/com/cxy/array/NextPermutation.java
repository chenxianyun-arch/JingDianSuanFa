package com.cxy.array;


/**
 * 求出下一个最大的排列的数组
 *
 * 思路：123->132 1234->1243
 */
public class NextPermutation {
  //对数组进行交换的方法
//  public int[] swap(int[] nums,int index1,int index2){
//    int temp = nums[index1];
//    nums[index1] = nums[index2];
//    nums[index2] = temp;
//    return nums;
//  }
  //对数组进行逆置
  int[] nums = new int[]{1,2,3,8,5,7,6,4};
  private int[] inversion(int[] nums,int index){
    System.out.println(index+"ddd");
    int i = 0;
    for(; index< nums.length-1; index++){
      System.out.println(index+"sss");
      int temp = nums[nums.length-1-i];
      nums[nums.length-1-i] = nums[index+i];
      nums[index+i] = temp;
//      i++;
//      if(i>nums.length-1-index){
//        break;
//      }
    }
    return nums;
  }
  public int[] nextPermutation() {
    //两个指针指向相邻的两个元素
    int i = nums.length - 2;
    int j = nums.length - 1;
    int maxIndex = 0;
    boolean flag = false;
    if(nums == null || nums.length == 2)return null;
    while(i >= 0){
      if (nums[i] <= nums[j]){
        //找到第一次升序的数组元素位置
        maxIndex = j;
        System.out.println(maxIndex);
        flag = true;
        break;
      }else {
        i--;
        j--;
      }
    }
    if(flag){
      //如果存在这样的组合,从左往右查看是否有比nums[j-1]第一次大的元素，有就交换
      for(int k = nums.length-1; k>j-1 ;k--){
        if(nums[k] > nums[j-1]){
          //如果存在，交换
          int temp = nums[j-1];
          nums[j-1] = nums[k];
          nums[k] = temp;
        }
      }
      //交换完之后对数组逆置
      int[] ints = this.inversion(nums, j - 1);
      nums = ints;
    }
    return nums;
  }
  public void iterater(){
    int[] ints = this.nextPermutation();
    int count = 0;
    while (ints != null){
      System.out.println(ints[count]);
      count++;
    }
  }

  public static void main(String[] args) {
    new NextPermutation().iterater();
  }
}
