package com.cxy.stack;

import java.util.Stack;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class Trap {

  public int trap(int[] height) {
    //创建栈用于保存给定的数组的下标值
    Stack<Integer> stack = new Stack<>();
    //存储返回结果和返回值
    int i = 0,res=0;
    //遍历整个数组
    while(i<height.length){
      //内层循环目的是找到多个值之间到底有多长
      //如果当前元素的高度大于前面一个，就要进行计算存储的水有多少
      //判断的条件是栈不为空，并且当前元素的高度要大于前一个（查找左边界）
      while(!stack.isEmpty() && height[i]>height[stack.peek()]){
        //取出当前元素的高度
        int currentHeight = height[i];
        //中间凹陷的索引
        int preIndex = stack.pop();
        if(stack.isEmpty())break;
        //找到中间凹陷处的高度
        int centerHeight = height[preIndex];
        //中间凹陷处的前一个元素的高度
        int preHeight = height[stack.peek()];
        //真正能够装水的高度=左右两边高度的最小值 - 中间凹陷的高度
        int minHeight = Math.min(currentHeight,preHeight) - centerHeight;
        //----------------------前面获取凹陷的高度--------------------------
        //----------------------下面获取凹陷的宽度--------------------------
        int width = i-stack.peek()-1;
        res += width*minHeight;
        //取出当前元素的前一个的前
      }
      //最后要将索引值+1进入下一个循环遍历
      stack.push(i++);
    }
    return res;
  }
}
