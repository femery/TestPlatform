package jianzhiOFFER.t48;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Auther: hsx
 * @Date: 2020/3/4
 * @Description: 面试题48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t48 {
    public static void main(String[] args) {
        t48 tt =new t48();
        System.out.println(tt.lengthOfLongestSubstring("bbbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue =new LinkedList();
        char[] chars =s.toCharArray();
        int max=0;
        for(int i=0;i<chars.length;i++){
            if(queue.contains(chars[i])){
                while(queue.remove()!=chars[i]){
                    continue;
                }
                queue.add(chars[i]);
            }else{
                queue.add(chars[i]);
            }
            max=max>queue.size()?max:queue.size();
        }
        return max;
    }
}
