package com.cxy.array;
/**
 *给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *  * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *  * 给定数组 nums = [1,1,2],
 *  *
 *  * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *  * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class RemoveDuplicates2 {

  public int removeDuplicates(int[] nums) {
    if(nums.length == 0){
      return 0;
    }
    //右指针
    int j = 1;
    //左指针
    int i = 0;
    while (j < nums.length){
      //如果不相等，就将j那个位置的元素覆盖掉i+1上的元素
      if(nums[j] != nums[i]){
        nums[i+1] = nums[j];
        //指针右指针右移
        i++;
      }
      //左指针右移
      j++;
    }
    return i+1;
  }
}
