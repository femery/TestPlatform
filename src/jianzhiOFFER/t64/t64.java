package jianzhiOFFER.t64;

/**
 * @Auther: hsx
 * @Date: 2020/2/12
 * @Description: jianzhiOFFER.t64
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 *
 * 输入: n = 9
 * 输出: 45
 *  
 * 限制：
 *
 * 1 <= n <= 10000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qiu-12n-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t64 {
    public static void main(String[] args) {
        t64 tt =new t64();
        System.out.println(tt.sumNums(3));
    }
    public int sumNums(int n) {
        int sum=0;
        boolean b = n > 0 && (sum = n + sumNums(n-1)) > 0;

        return sum;

    }
}
