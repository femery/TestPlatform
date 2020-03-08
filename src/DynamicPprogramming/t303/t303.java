package DynamicPprogramming.t303;

/**
 * @Auther: hsx
 * @Date: 2019/12/13
 * @Description:303. 区域和检索 - 数组不可变
给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
示例：
给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
说明:

你可以假设数组不可变。
会多次调用 sumRange 方法。
 */


import java.util.HashMap;
import java.util.Map;

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
public class t303 {
    int[] sum;
    int len;
    public static void main(String[] args) {
        int[] nums={-2, 0, 3, -5, 2, -1};
        t303 tt =new t303(nums);
        System.out.println(tt.sumRange(0,5));
    }
    public  t303(int[] nums) {
        len=nums.length;
        if(len>0){
            sum=new int[len];
            sum[0]=nums[0];
            for(int x=1;x<len;x++){
                sum[x]=sum[x-1]+nums[x];
            }
        }
    }
    public int sumRange(int i, int j) {
        if(i==0){
            return sum[j];
        }else{
            return sum[j]-sum[i-1];
        }

    }
}


