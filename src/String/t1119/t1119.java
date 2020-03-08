package String.t1119;

/**
 * @Auther: hsx
 * @Date: 2020/1/4
 * @Description: 1119. 删去字符串中的元音
 * 给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 * 示例 1：
 *
 * 输入："leetcodeisacommunityforcoders"
 * 输出："ltcdscmmntyfrcdrs"
 * 示例 2：
 *
 * 输入："aeiou"
 * 输出：""
 *  
 * 提示：
 *
 * S 仅由小写英文字母组成。
 * 1 <= S.length <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-vowels-from-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t1119 {
    public static void main(String[] args) {

    }

    public String removeVowels(String S) {
        S=S.replaceAll("a","").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
        return S;
    }


}
