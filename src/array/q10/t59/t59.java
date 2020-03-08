package array.q10.t59;

/**
 * @Auther: hsx
 * @Date: 2019/12/21
 * @Description: 59. 螺旋矩阵 II
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 示例:
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class t59 {
    public static void main(String[] args) {
        t59 tt=new t59();
        int n=0;
        int[][] res=tt.generateMatrix(5);
        for(int[] j:res){
            for(int i:j){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int l=0,u=0,r=n-1,b=n-1;
        int target=n*n;
        int number=1;
        while(number<=target){
            //从左往右
            for(int i=l;i<=r;i++){
                res[u][i]=number;
                number++;
            }
            u++;
            //从上往下
            for(int i=u;i<=b;i++){
                res[i][r]=number;
                number++;
            }
            r--;
            //从右往左
            for(int i=r;i>=l;i--){
                res[b][i]=number;
                number++;
            }
            b--;
            //从下往上
            for(int i=b;i>=u;i--){
                res[i][l]=number;
                number++;
            }
            l++;

        }
        return res;
    }
}
