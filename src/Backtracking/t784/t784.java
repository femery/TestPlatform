package Backtracking.t784;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/7
 * @Description: Backtracking.t784
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *  英文字母的ascii：   a-z:97-122,A-Z:65-90,0-9:48-57
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 */
public class t784 {
    public static void main(String[] args) {
        t784 t=new t784();
        List<String> list=t.letterCasePermutation("b1a3");

        System.out.println(list.size());
        for(String s:list){
            System.out.println(s);
        }
    }

    public List<String> letterCasePermutation(String S) {
        List<String> list =new ArrayList<>();
        char[] strs=S.toCharArray();
        letterTurn(list,strs,0);
        return list;
    }

    public void letterTurn(List<String> list,char[] strs,int index){

        list.add(String.valueOf(strs));

        for(int i=index;i<strs.length;i++){

            if(strs[i]>='0' && strs[i]<='9'){
                continue;
            }
            reverseStr(strs,i);
            letterTurn(list,strs,i+1);
            reverseStr(strs,i);

        }

    }

    public void reverseStr(char[] strs,int i){

        if(strs[i]>=65 &&strs[i] <=90){
            strs[i]+=32;
        }else{
            strs[i]-=32;
        }

    }


}
