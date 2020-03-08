package jianzhiOFFER.t50;

/**
 * @Auther: hsx
 * @Date: 2020/2/16
 * @Description: 面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *  
 * 限制：
 *
 * 0 <= s 的长度 <= 50000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t50 {
    public static void main(String[] args) {
        t50 tt =new t50();
        System.out.println(tt.firstUniqChar("abaccdeff"));
        System.out.println(tt.firstUniqChar(""));
    }

    public char firstUniqChar(String s) {
        if(s.equals("")){
            return ' ';
        }

        char[] chars = s.toCharArray();
        int len = chars.length;
        while(s.length()>0){
            String ss=String.valueOf(s.charAt(0));



            int len1 = s.length();
            s=s.replaceAll(ss,"");
            int len2 = s.length();
            if(len1-len2==1){
                return ss.charAt(0);
            }

        }
        return ' ';

    }
}
