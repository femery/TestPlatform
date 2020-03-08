package GreedyAlgorithm.q10.t1005;

/**
 * @Auther: hsx
 * @Date: 2019/12/11
 * @Description: GreedyAlgorithm.q10.t1005
 * 1005. K 次取反后最大化的数组和
 * 给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个个索引 i 并将 A[i] 替换为 -A[i]，
 * 然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
 *
 * 以这种方式修改数组后，返回数组可能的最大和。
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 */
public class t1005 {
    public static void main(String[] args) {
        int k=1;
        int[] A={4,2,3};
        t1005 tt =new t1005();
        System.out.println(tt.largestSumAfterKNegations(A,k));

    }

    public int largestSumAfterKNegations(int[] A, int k) {
        int min;
        int sum=0;
        for(int i=0;i<k;i++){
            min=0;
            for(int j=1;j<A.length;j++){
                if(A[min]>A[j]){
                    min=j;
                }
            }
            if(min !=0){
                int temp=A[0];
                A[0]=A[min];
                A[min]=temp;
            }

            A[0]=-A[0];

        }

        for(int i:A){
            sum+=i;
        }
        return sum;
    }

}















