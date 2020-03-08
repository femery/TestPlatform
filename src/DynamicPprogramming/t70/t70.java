package DynamicPprogramming.t70;

/**
 * @author heshixiang
 * @Auther: hsx
 * @Date: 2019/12/4
 * @Description: DynamicPprogramming.t53.t53.t70
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * @version: 1.0
 */
public class t70 {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if (n == 2) {

            return 2;
        }
        int[] array=new int[n+1];
        array[1]=1;
        array[2]=2;
        for(int i=3;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }

        return array[n];

    }

    public int climbStairs2(int n) {
        if(n==1){
            return 1;
        }
        if (n == 2) {

            return 2;
        }

        int a=1;
        int b=2;
        int k;
        for(int i=3;i<=n;i++){
            k=b;
            b=k+a;
            a=b;
        }

        return b;

    }
}
