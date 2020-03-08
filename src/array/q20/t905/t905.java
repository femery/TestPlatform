package Toutiao01;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/1/1
 * @Description: 905. 按奇偶排序数组
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 *输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class t905 {
    public static void main(String[] args) {
        t905 tt =new t905();
        int[] A={2,1,1,10,0,0,1};
        System.out.println(Arrays.toString(tt.sortArrayByParity(A)));
    }
    public int[] sortArrayByParity(int[] A) {
        int index=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                int k=A[index];
                A[index]=A[i];
                A[i]=k;
                index++;
            }
        }

        return A;
    }
}
