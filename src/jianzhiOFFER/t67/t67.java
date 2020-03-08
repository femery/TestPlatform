package jianzhiOFFER.t67;

/**
 * @Auther: hsx
 * @Date: 2020/2/14
 * @Description: 面试题67. 把字符串转换成整数
 * @version: 1.0
 */
public class t67 {
    public static void main(String[] args) {
        t67 tt = new t67();
        System.out.println(tt.strToInt("   -42^&*23^"));
    }

    public int strToInt(String str) {
        if (str.trim().equals("")) {
            return 0;
        }
        str = str.trim();
        long res = 0L;
        boolean zf = true;
        if (str.charAt(0) != '-' && str.charAt(0) != '+' && (str.charAt(0) < '0' || str.charAt(0) > '9')) {
            return 0;
        }
        if (str.charAt(0) == '-') {
            zf = false;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            res = Long.parseLong(String.valueOf(str.charAt(0)));
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }
            res = res * 10;
            res += Long.parseLong(String.valueOf(str.charAt(i)));
            if (zf == true && res >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (zf == false && -res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        if (zf == false) {
            res = -res;
        }
        return (int) res;
    }
}
