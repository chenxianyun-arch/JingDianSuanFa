package com.cxy.string;


/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * LDREOEIIECIHNTSG
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StringConvert {
  public String convert(String s, int numRows) {
    //判断如果s为空或者长度为0返回为s,并且还有一种条件就是numRows为一行的时候显示还是原来的s
    if(s.length() == 0 || s == null || numRows == 1){return s;}
    //用StringB
    //设置每一行运行的方向
    int dir = 1;
    int index = 0;
    StringBuilder[] rowArr = new StringBuilder[numRows];
    for(int i=0;i<numRows;i++){
      //为每一行new出各自的空间
      rowArr[i] = new StringBuilder();
    }
    for(char c: s.toCharArray()){
      rowArr[index].append(c);
      index += dir;
      //满足最后的index == 0 || index == nomRows-1 dir反转
      if(index == 0 || index == numRows-1){dir = -dir;}
    }
    StringBuilder res = new StringBuilder();
    for(StringBuilder item:rowArr){
      res.append(item.toString());
    }
    return res.toString();
  }
  public static void main(String[] args){
    StringConvert convert = new StringConvert();
    String s = convert.convert("LEETCODEISHIRING", 4);
    System.out.println(s);
  }
}
