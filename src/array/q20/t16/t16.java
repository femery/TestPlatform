package array.q20.t16;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2019/12/30
 * @Description: 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class t16 {
    public static void main(String[] args) {
        t16 tt =new t16();
        int[] nums={-1,2,1,-4};
        int target=1;
        System.out.println(tt.threeSumClosest(nums,target));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            int start=i+1; int end= length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=sum;
                }
                if(target>sum){
                    start++;
                }else if(target<sum){
                    end--;
                }else{
                    return ans;
                }
            }
        }
        return ans;
    }

}
