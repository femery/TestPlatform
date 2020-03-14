package list.t42;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/3/12
 * @Description: list.t42
 * @version: 1.0
 */
public class t42 {
    public static void main(String[] args) {
        t42 tt =new t42();
        int[] nums ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(tt.trap(nums));

    }

//    public int trap(int[] height) {
//        int length = height.length;
//        //保存从左往右遍历时，每一个下标位置当前的最高柱子高度
//        int[] left = new int[length];
//        //保存从右往左遍历时，每一个下标位置当前的最高柱子高度
//        int[] right = new int[length];
//        int leftMax = 0;
//        int rightMax = 0;
//        int sum = 0;
//
//        //计算left和right数组
//        for (int i = 0; i < length; i++) {
//            if (height[i] > leftMax) {
//                leftMax = height[i];
//            }
//            left[i] = leftMax;
//            if (height[length-1-i] > rightMax) {
//                rightMax = height[length-1-i];
//            }
//            right[length-1-i] = rightMax;
//        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
//        System.out.println(Arrays.toString(height));
//
//        //遍历，只有当前柱子往左看、往右看的最高柱子都比当前柱子高，才能接住雨水
//        for (int j = 0; j < length; j++) {
//            if (height[j] < left[j] && height[j] < right[j]) {
//                sum = sum + Math.min(left[j], right[j]) - height[j];
//            }
//        }
//        return sum;
//    }

//    作者：king-93
//    链接：https://leetcode-cn.com/problems/trapping-rain-water/solution/javazui-jian-dan-jie-fa-chao-ji-yi-li-jie-yong-shi/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public int trap(int[] height) {
        int len =height.length;
        int sum=0;
        int[] left=new int[len];
        int[] right=new int[len];
        int leftMax=0;
        int rightMax=0;
        for(int i=0;i<len;i++){
            if(leftMax>height[i]){
                leftMax=height[i];
            }
            left[i]=leftMax;
            if(rightMax>height[len-1-i]){
                rightMax=height[len-1-i];
            }
            right[len-1-i]=rightMax;
        }

        System.out.println(Arrays.toString(left));
       System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(height));
        for(int i=0;i<len;i++){
            if(height[i]<left[i] && height[i]<right[i]){
                sum+=(Math.min(left[i],right[i])-height[i]);
            }
        }
        return sum;
    }

}
