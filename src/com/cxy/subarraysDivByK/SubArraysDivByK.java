package com.cxy.subarraysDivByK;

/**
 * 给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
 * 示例：
 *
 * 输入：A = [4,5,0,-2,-3,1], K = 5
 * 输出：7
 * 解释：
 * 有 7 个子数组满足其元素之和可被 K = 5 整除：
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SubArraysDivByK {
  int count = 0;
  public int subArraysDivByk(){
    int[] A = new int[]{4,5,0,-2,-3,1};
    int K = 5;
    int sumi = 0;
    int sumj = 0;
    for(int i = 0;i < A.length;i++){
      sumi+=A[i];
      for(int j=0;j<A.length;j++){
        sumj+=A[j];
        if(sumi%K==sumj%K){
          this.count++;
        }
      }
    }
    return this.count;
  }
  public static void main(String[] args) {
    SubArraysDivByK subArraysDivByK = new SubArraysDivByK();
    System.out.println(subArraysDivByK.subArraysDivByk());
  }
}
