package GreedyAlgorithm.q10.t1221;

import java.util.Stack;

/**
 * @Auther: hsx
 * @Date: 2019/12/11
 * @Description: 1221. 分割平衡字符串
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * 示例 1：
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 2：
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 3:
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 */
public class t1221 {
    public static void main(String[] args) {
        t1221 tt=new t1221();
        String s="LLLLRRRR";
        System.out.println(tt.balancedStringSplit(s));
    }

    public int balancedStringSplit(String s) {
        int sum=0;
        Stack stack=new Stack();
        char[] chars=s.toCharArray();
        stack.push(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
                continue;
            }
            char last=(char)stack.lastElement();
            if((last+chars[i])==158){
                stack.pop();
            }else{
                stack.push(chars[i]);
            }
            if(stack.isEmpty()){
                sum++;
            }
        }

        return sum;
    }

}
