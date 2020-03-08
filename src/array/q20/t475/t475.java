package array.q20.t475;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2020/1/1
 * @Description: 475. 供暖器
 * 冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 * <p>
 * 现在，给出位于一条水平线上的房屋和供暖器的位置，找到可以覆盖所有房屋的最小加热半径。
 * <p>
 * 所以，你的输入将会是房屋和供暖器的位置。你将输出供暖器的最小加热半径。
 * <p>
 * 说明:
 * <p>
 * 给出的房屋和供暖器的数目是非负数且不会超过 25000。
 * 给出的房屋和供暖器的位置均是非负数且不会超过10^9。
 * 只要房屋位于供暖器的半径内(包括在边缘上)，它就可以得到供暖。
 * 所有供暖器都遵循你的半径标准，加热的半径也一样。
 * 示例 1:
 * <p>
 * 输入: [1,2,3],[2]
 * 输出: 1
 * 解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4],[1,4]
 * 输出: 1
 * 解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/heaters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t475 {
    public static void main(String[] args) {
        t475 tt = new t475();
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        System.out.println(tt.findRadius(houses, heaters));
    }

  //  找到每个房屋离加热器的最短距离（即找出离房屋最近的加热器），然后在所有距离中选出最大的一个即为结果。
 //   即：所有最短距离中的最长值
    //思路：找到每个房屋离加热器的最短距离（即找出离房屋最近的加热器），然后在所有距离中选出最大的一个即为结果。
    public int findRadius(int[] houses, int[] heaters) {
        //进行排序
        Arrays.sort(houses);
        Arrays.sort(heaters);
        //记录最终的最短管道距离
        int max = 0;
        //寻找每一个房屋的最近加热器的距离，然后记录这些最短距离中的最大值
        for (int i = 0; i < houses.length; i++) {
            int start = 0;
            int end = heaters.length - 1;
            //二分查找，在heaters中寻找与房屋 c 最近的加热器
            while (start < end) {
                int mid = (start + end) / 2;
                if (houses[i] > heaters[mid]) {
                    start = mid+1;
                } else {
                    end=mid;
                }
            }
            //记录当前选中的这个加热器距离目标房屋的距离（可正可负）
            int len = heaters[start] - houses[i];
            //如果是负的，则说明这是在房屋的左边的第一个加热器
            if (len < 0) {
                max = Math.max(max, -len);
            } else if (len > 0) {
                //分两种情况讨论
                //如果start左边还有start-1，则说明start是右边第一个，start-1是左边最接近的，讨论两个中最近的那个返回
                //如果start是第一个数，则直接让他与max比较
                if (start > 0) {
                    max = Math.max(Math.min(houses[i] - heaters[start - 1], len), max);
                } else {
                    max = Math.max(max, len);
                }
            }
        }
        //max即为所求
        return max;
    }
}
