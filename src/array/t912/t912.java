package array.t912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2020/1/10
 * @Description: 912. 排序数组
 * 给定一个整数数组 nums，将该数组升序排列。
 *
 * 示例 1：
 *
 * 输入：[5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：[5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *  
 * 提示：
 *
 * 1 <= A.length <= 10000
 * -50000 <= A[i] <= 50000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t912 {
    public static void main(String[] args) {

    }

    public List<Integer> sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        List<Integer> list = new ArrayList<Integer>();
        for( int i:nums){
            list.add(i);
        }
        return list;
    }

    public void quickSort(int[] nums,int start,int end){
        if(start>end){
            return ;
        }
        int k=nums[start];
        int i=start;
        int j= end;
        while(i!=j){
            while(i<j && nums[j]>=k){
                j--;
            }
            while(i<j && nums[i]<=k){
                i++;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }

        nums[start]=nums[i];
        nums[i]=k;

        quickSort(nums,start,i-1);
        quickSort(nums,i+1,end);

    }

}
