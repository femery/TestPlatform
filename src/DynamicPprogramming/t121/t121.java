package DynamicPprogramming.t121;

/**
 * @Auther: hsx
 * @Date: 2019/12/12
 * @Description: 121. 买卖股票的最佳时机,动态规划
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入股票前卖出股票。
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class t121 {
    public static void main(String[] args) {
        t121 tt=new t121();
        int[] prices={7,1,5,3,6,4};
        System.out.println(tt.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max=0;
        int k;
        int min=Integer.MAX_VALUE;
        int len=prices.length;
        for(int i=0;i<len;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            k=prices[i]-min;
            if(k>max){
                max=k;
            }
        }
        return max;
    }

}
