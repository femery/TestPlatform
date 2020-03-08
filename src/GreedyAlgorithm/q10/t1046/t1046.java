package GreedyAlgorithm.q10.t1046;

import java.util.Arrays;

/**
 * @Auther: hsx
 * @Date: 2019/12/11
 * @Description: 1046. 最后一块石头的重量
 * 有一堆石头，每块石头的重量都是正整数。
 *
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * 提示：
 *
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 */
public class t1046 {
    public static void main(String[] args) {
        t1046 tt=new t1046();
        int[] stones={20,21};
        System.out.println(tt.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        int len=stones.length;
        if(len==1){
            return stones[0];
        }
        int len2=len;
        while(len>0){
            Arrays.sort(stones);
            if(stones[len2-2]==0 ||stones[len2-1]==0){
                break;
            }

            int a=stones[len2-1]-stones[len2-2];
            if(a>0){
                stones[len2-2]=0;
                stones[len2-1]=a;
                len--;

            }else{
                stones[len2-1]=0;
                stones[len2-2]=0;
                len=len-2;
            }
        }

        Arrays.sort(stones);

        return stones[len2-1];
    }

}
