package String.t5;

/**
 * @Auther: hsx
 * @Date: 2020/1/17
 * @Description: 5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t5 {
    public static void main(String[] args) {
        t5 tt =new t5();
        String s="babad";
        System.out.println(tt.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        String rev=new StringBuffer(s).reverse().toString();
        int len=s.length();
        String res="";
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i<len-j){
                    if((s.substring(i,len-j)).equals(rev.substring(j,len-i))){

                        if(res.length()<(len-j-i)){
                            res=s.substring(i,len-j);
                        }
                        break;
                    }
                }

            }

        }

        return res;
    }

}
