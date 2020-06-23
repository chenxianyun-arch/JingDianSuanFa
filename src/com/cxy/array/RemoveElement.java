package com.cxy.array;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveElement {

  public int removeElement(int[] nums, int val) {

    if(nums.length == 0 || nums == null){return 0;}
    //左指针
    int i = 0;
    int count = 0;
    for(;i<nums.length;){
      //如果当前元素等于val值，就将j对应的元素值覆盖掉前一个元素
      if(nums[i] == val){
        if(i == nums.length-1){
          nums[i] = 0;
        }else {
          nums[i] = nums[i+1];
        }
        count++;
      }
      i++;
    }
    for(int item:nums){
      System.out.println(item);
    }
    return nums.length-count;
  }

  public static void main(String[] args) {
    RemoveElement element = new RemoveElement();
    int[] arr = new int[]{0,1,2,2,3,0,4,2};
    int i = element.removeElement(arr, 2);
    System.out.println(i);
  }
}
