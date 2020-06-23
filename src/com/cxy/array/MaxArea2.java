package com.cxy.array;


/**
 * 双指针法实现装最多水的体积
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为
 *  (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxArea2 {
  public static int maxArea() {
    int[] height = new int[]{1,8,6,2,5,4,8,3,7};
    //指向最右边的指针   和     结果
    int j = height.length-1,res = 0;
    for(int i=0;i<height.length;){
      if(i == j){
        break;
      }
      //求出两边睡得长度更小，谁小谁就移动指针
      int minH = Math.min(height[i],height[j]);
      //将结果与上一次循环出来的结果进行比较，选出最大的一个
      res = Math.max(res,minH*(j-i));
      System.out.println("计算结果为："+res+"  当给的j值："+j+"当前的最小高度为："+minH+" 中间的长度为"+(j-i));
      if(height[i]<height[j]){
        i++;
      }else {
        j--;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int i = MaxArea2.maxArea();
    System.out.println(i);
  }
}
