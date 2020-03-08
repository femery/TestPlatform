package Number.t1281;

/**
 * @Auther: hsx
 * @Date: 2019/12/19
 * @Description: 1281. 整数的各位积和之差
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * 示例 1：
 *
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * 示例 2：
 *
 * 输入：n = 4421
 * 输出：21
 * 解释：
 * 各位数之积 = 4 * 4 * 2 * 1 = 32
 * 各位数之和 = 4 + 4 + 2 + 1 = 11
 * 结果 = 32 - 11 = 21
 */
public class t1281 {
    public static void main(String[] args) {
        t1281 tt =new t1281();
        int n=234;
        System.out.println(tt.subtractProductAndSum(n));
    }

    public int subtractProductAndSum(int n) {
        int res=0;
        int product=1;
        int sum=0;
        char[] c=String.valueOf(n).toCharArray();
        for(char s:c){
            sum+=Integer.parseInt(String.valueOf(s));
            product *=Integer.parseInt(String.valueOf(s));
        }
        res=product-sum;
        return res;
    }
}
