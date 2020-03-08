package jianzhiOFFER.t58;

/**
 * @Auther: hsx
 * @Date: 2020/2/20
 * @Description: jianzhiOFFER.t58
 * @version: 1.0
 */
public class t58 {


    public String reverseLeftWords(String s, int n) {
        String str=s.substring(0,n);
        s=s.substring(n,s.length())+str;
        return s;

    }
}
