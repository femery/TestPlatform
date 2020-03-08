package String.t443;

/**
 * @Auther: hsx
 * @Date: 2020/1/27
 * @Description: 443. 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 *
 * 压缩后的长度必须始终小于或等于原数组长度。
 *
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 *
 * 在完成原地修改输入数组后，返回数组的新长度。
 *
 *  
 *
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * ["a","a","b","b","c","c","c"]
 *
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 *
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * 示例 2：
 *
 * 输入：
 * ["a"]
 *
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 *
 * 说明：
 * 没有任何字符串被替代。
 * 示例 3：
 *
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 *
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 *
 * 说明：
 * 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
 * 注意每个数字在数组中都有它自己的位置。
 * 注意：
 *
 * 所有字符都有一个ASCII值在[35, 126]区间内。
 * 1 <= len(chars) <= 1000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-compression
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t443 {
    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        t443 tt =new t443();
        System.out.println(tt.compress(chars));
    }

    public int compress(char[] chars) {
        int len =chars.length;
        //长度为1，直接返回
        if(len==1){
            return 1;
        }
        char c1=chars[0];
        char c2=chars[0];
        //sum，相同字符的个数
        int sum=1;
        //最终返回的长度
        int length=1;
        //返回数组在调整时候的下标
        int index=1;
        for(int i=1;i<len;i++){
            c2=chars[i];
            if(c2==c1){
                sum++;
            }else{
                if(sum!=1){
                    String sumStr=String.valueOf(sum);
                    length+=sumStr.length();
                    char[] cs=sumStr.toCharArray();
                    for(int j=0;j<cs.length;j++){
                        chars[index++]=cs[j];
                    }
                }
                sum=1;
                length++;
                c1=c2;
                chars[index++]=c2;
            }


        }
        //最后的收尾
        if(sum!=1){
            String sumStr=String.valueOf(sum);
            length+=sumStr.length();
            char[] cs=sumStr.toCharArray();
            for(int j=0;j<cs.length;j++){
                chars[index++]=cs[j];
            }
        }

        return length;
    }

}
