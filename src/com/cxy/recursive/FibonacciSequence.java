package com.cxy.recursive;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 *
 *  
 *
 * Example 1:
 *
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FibonacciSequence {

  //1.函数是用来干什么的：计算f(N)
  //2.函数结束条件是什么：当n为0或者为1的时候就应该结束
  //3.寻找函数的等式或者给下一层返回的是什么：f(n) = f(n-1) + f(n-2)

  public int fib(int N) {
    if(N == 0 || N ==1){return N;}
    return fib(N-1)+fib(N-2);
  }


  public static void main(String[] args) {
    FibonacciSequence sequence = new FibonacciSequence();
    int i = sequence.fib(3);
    System.out.println(i);
  }
}
