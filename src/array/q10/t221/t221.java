package array.q10.t221;

/**
 * @Auther: hsx
 * @Date: 2019/12/18
 * @Description: 221. 最大正方形,动态规划
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * 示例:
 * 输入:
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 *
 * 输出: 4
 */
public class t221 {
    public static void main(String[] args) {
        t221 tt=new t221();
        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(tt.maximalSquare(matrix));
    }

    public int maximalSquare(char[][] matrix) {
        int row_len=matrix.length;
        int col_len=row_len>0?matrix[0].length:0;
        int[][] res=new int[row_len+1][col_len+1];
        int max=0;
        //注意从1开始，到等于行与列
        for(int i=1;i<=row_len;i++){
            for(int j=1;j<=col_len;j++){
                if(matrix[i-1][j-1]=='1') {
                    res[i][j]=Math.min(res[i-1][j],Math.min(res[i][j-1],res[i-1][j-1]))+1;
                }
                if(max<res[i][j]){
                    max=res[i][j];
                }
            }
        }

        return max*max;
    }

}
