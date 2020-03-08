package Backtracking.t51;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/7
 * @Description: test
 * @version: 1.0
 */
public class NQueensPuzzle {
    public  static  List<int[][]> res=new ArrayList<>();
    public  static  int n=8;
    public  static  int sum=0;
    public static void main(String[] args) {
        //res=findQueue(8);
        findQueue(8);
        System.out.println(sum);

        for(int[][] a:res){
            for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();

        }
    }

    public static void findQueue(int n){
        int[][] oneRes=new int[8][8];
        for(int[]a:oneRes){
            for(int b:a){
                b=0;
            }
        }
        solve(oneRes,0);

    }

    public static  void solve(int [][]one,int lev){
        if(lev==n){
            sum++;
           // printRes(one);
            int[][] b=one.clone();
            res.add(b);
        }

        for(int i=0;i<n;i++){
            if(!check(one,lev,i)){
                continue;
            }
            one[lev][i]=1;
            solve(one,lev+1);
            one[lev][i]=0;

        }

    }

    /* 是否可以在 board[row][col] 放置皇后？ */
    public static  boolean check(int[][] one, int row, int col) {

        // 检查列是否有皇后互相冲突
        for (int i = 0; i < n; i++) {
            if (one[i][col] == 1){
                return false;
            }

        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (one[i][j] ==1){
                return false;
            }

        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (one[i][j] ==1){
                return false;
            }

        }
        return true;
    }


    public static void printRes(int [][] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }





}
