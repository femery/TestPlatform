package String.t1021;

import java.util.Stack;

/**
 * @Auther: hsx
 * @Date: 2019/12/23
 * @Description: 1021. 删除最外层的括号
 * @version: 1.0
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 * 示例 1：
 *
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 *
 */
public class t1021 {
    public static void main(String[] args) {
        t1021 tt= new t1021();
        String s="(()())(())(()(()))";
        System.out.println(tt.removeOuterParentheses(s));
    }

    public String removeOuterParentheses(String S) {

        char[] chars=S.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                stack.push(chars[i]);

            }else{
                stack.pop();
            }


            if(stack.isEmpty()==true){
                chars[i]='0';
            }else if(stack.size()==1 &&chars[i]=='('){
                chars[i]='0';
            }

        }


        return String.valueOf(chars).replaceAll("0","");
    }
}
