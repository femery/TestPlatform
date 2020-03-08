package jianzhiOFFER.t42;

/**
 * @Auther: hsx
 * @Date: 2020/2/15
 * @Description: 面试题42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *  
 * 提示：
 *
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t42 {
    public static void main(String[] args) {
        t42 tt =new t42();
    }

    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if((sum+nums[i])>0){
                sum +=nums[i];
            }else{
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
