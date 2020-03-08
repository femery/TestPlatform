package array.q20.t1252;

/**
 * @Auther: hsx
 * @Date: 2019/12/22
 * @Description: 1252. 奇数值单元格的数目
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
 *
 */
public class t1252 {
    public static void main(String[] args) {
        t1252 tt=new t1252();
        int[][] indices={{0,1},{1,1}};
        System.out.println(tt.oddCells(2,3,indices));
    }

    public int oddCells(int n, int m, int[][] indices) {
        int sum=0;
        int[][] array=new int[n][m];
        for(int[] x:indices){
            int row=x[0];
            int col=x[1];
            for(int j=0;j<m;j++){
                array[row][j] +=1;
            }
            for(int i=0;i<n;i++){
                array[i][col] +=1;
            }
        }
        for(int[] x:array){
            for(int y:x){
                if(y%2==1){
                    sum++;
                }
            }
        }
        return sum;
    }
}
