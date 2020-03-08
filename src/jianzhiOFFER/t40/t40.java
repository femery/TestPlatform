package jianzhiOFFER.t40;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/2/15
 * @Description: 试题40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *  
 *
 * 限制：
 *
 * 0 <= k <= arr.length <= 1000
 * 0 <= arr[i] <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t40 {
    public static void main(String[] args) {
        t40 tt =new t40();
        int[] nums={0,0,1,2,4,2,2,3,1,4};
        System.out.println(Arrays.toString(tt.getLeastNumbers(nums,8)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {

        int[] res = new int[k];
        if(k==0){
            return res;
        }
        int len = arr.length;
        if(k==len){
            return arr;
        }

        System.arraycopy(arr, 0, res, 0, k);
        Arrays.sort(res);

        for(int i=k;i<len;i++){
            if(arr[i]<res[k-1]){
                res[k-1]=arr[i];
                Arrays.sort(res);
                System.out.println(Arrays.toString(res));
            }
        }
        return res;

    }
}
