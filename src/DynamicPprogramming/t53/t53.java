package DynamicPprogramming.t53;

/**
 * @Auther: hsx
 * @Date: 2019/12/4
 * @Description: DynamicPprogramming.t53.t53
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @version: 1.0
 */
public class t53 {

    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int n:nums){
            if(sum>0){
                sum +=n;
            }else {
                sum=n;
            }
            max= Math.max(max, sum);
        }
        return max;
    }

}
