package array.q20.t338;

/**
 * @Auther: hsx
 * @Date: 2019/12/28
 * @Description: 338. 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: [0,1,1]
 * 示例 2:
 *
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 * 进阶:
 *
 * 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
 * 要求算法的空间复杂度为O(n)。
 * 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。
 *
 * 想了好久才想到如何通过dp实现O(n)复杂度，
 * 对于一个二进制数来说，如果它的最低位为1(%2 为 1）,则它与 n/2 的 1 个数相差1。
 * 如果它的最低位为 0，则它与 n/2 的 1 个数相同
 * 这样就可以用前面的推出后面的
 * 时间：2ms
 * ```
 * * public int[] countBits(int num) {
 *  *     int dp[] = new int[num+1];
 *  *     for (int i = 0; i <= num/2; i++) {
 *  *         dp[i*2] = dp[i];
 *  *         if(i*2+1 <= num)
 *  *             dp[i*2+1] = dp[i] + 1;
 *  *     }
 *  *     return dp;
 *  * }
 * ```
 */
public class t338 {
    public static void main(String[] args) {

    }
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0;i<=num/2;i++){
            res[i*2]=res[i];
            if((i*2+1)<=num){
                res[i*2+1]=res[i]+1;
            }
        }
        return res;
    }
}
