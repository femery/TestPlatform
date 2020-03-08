package jianzhiOFFER.t15;

/**
 * @Auther: hsx
 * @Date: 2020/2/19
 * @Description: 面试题15. 二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 * 示例 1：
 *
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t15 {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int sum=0;
        while(n>0){
            if((n&1)==1){
                sum++;
            }
            n=n>>1;
        }
        return sum;
    }
}
