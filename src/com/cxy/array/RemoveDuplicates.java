package com.cxy.array;

import java.util.Stack;

/**
 *给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {
    int i = 0;
    //用于保存不重复的数字，遇到跟栈顶元素不重复的就入栈
    Stack<Integer> st = new Stack<>();
    if(nums.length==0){return 0;}else if(nums.length==1){return 1;}
    while(i<nums.length){
      if((i==0) || (!st.isEmpty() && nums[i]>st.peek())){
        st.push(nums[i]);
      }
      i++;
    }
    Object[] array = st.toArray();
    int[] newArr = new int[array.length];

    for(int j=0;j<newArr.length;j++){
//      System.out.println((int)array[j]);
      newArr[j] = (int)array[j];
    }
    nums = newArr;
    return st.size();
  }
}
