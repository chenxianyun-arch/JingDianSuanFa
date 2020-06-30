package com.cxy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParenthesis {

  /**
   * 采用递归调用的方法进行构造这个字符串
   */

  //用于存储的集合
  List<String> res = new ArrayList<>();
  public List<String> generateParenthesis(int n) {

    return null;
  }
  public void helper(int left , int right , String curStr, List result){

  }

  /**
   * 1.递归结束条件什么：都没有左括号和右括号的时候
   * 2.本次递归要做什么：将（）两个进行匹配
   * 3.需要返回什么给上一级，返回就是排列好的字符串
   */

  public static void main(String[] args) {
    ValidParenthesis parenthesis = new ValidParenthesis();
    parenthesis.generateParenthesis(4);
  }
}
