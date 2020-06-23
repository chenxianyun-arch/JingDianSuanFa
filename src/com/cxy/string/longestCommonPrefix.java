package com.cxy.string;
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * 通过次数294,081提交次数767,457
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class longestCommonPrefix {

  /**
   * @param
   * @return
   */
  public String longestCommonPrefix(String [] strs) {
    //1.拿到每一个数组中的字符串，保存下来
    //2.得到字符串中最小的一个长度，遍历此长度下的其余字符串的一个前n项的值是否相等，相等就返回相等的具体的字符，否则返回 ""
    if(strs.length == 0 || strs == null){return "";}
    String prefix = strs[0];
    int minLen = prefix.length();
    //找到最小的一个长度，这个，最长前 缀取决于短边
    for(int i=1; i<strs.length; i++){
      //遍历求最小的长度
      if(strs[i].length() < minLen) minLen = strs[i].length();
    }
    //进行于后面的字符串进行比较，比较得到最长的一个串进行输出
    StringBuilder res = new StringBuilder();
    for(int j=0; j< minLen; j++){
      char ch = strs[0].charAt(j);
      for(int k=1; k<strs.length ;k++){
        if(ch != strs[k].charAt(j)){
          return res.toString();
        }
      }
      res.append(ch);
    }
    return res.toString();
//    String s = "";
//    //长度为0直接返回空字符串
//    if(strs.length == 0) {
//      return s;
//    }
//    //minLen是最短字符串长度
//    int minLen = strs[0].length();
//    for(int i = 1; i < strs.length; i++){
//      if(strs[i].length() < minLen){
//        minLen = strs[i].length();
//      }
//    }
//    for(int i = 0; i < minLen; i++){
//      char ch = strs[0].charAt(i);
//      int flag = 1;
//      for(int j = 1; j < strs.length; j++){
//        if(ch != strs[j].charAt(i)){
//          return s;
//        }
//      }
//      s += ch;
//    }
//    return s;
  }

  public static void main(String[] args) {
    System.out.println(new longestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }
}
