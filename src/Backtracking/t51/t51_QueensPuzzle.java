package Backtracking.t51;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/7
 * @Description: Backtracking.t51
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 */
public class t51_QueensPuzzle {
    public static void main(String[] args) {
        t51_QueensPuzzle tt=new t51_QueensPuzzle();
        List<List<String>> lists=tt.solveNQueens(8);
        System.out.println(lists.size());
        for(List<String> list:lists){
            for(String s:list){
                System.out.println(s);
            }
            System.out.println();
            System.out.println("-----------------------");
            System.out.println();
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lists=new ArrayList<>();
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]=0;
            }
        }
       // List<String> list=new ArrayList<>();
        //StringBuffer sb=new StringBuffer();
//        for(int i=0;i<n;i++){
//            sb.append(".");
//        }
//        for(int i=0;i<n;i++){
//            list.add(sb.toString());
//        }
        findQueen(lists,res,n,0);
        return  lists;
    }

    public void findQueen(List<List<String>> lists,int[][] res,int n,int lev){
        if(lev==n){
            lists.add(toList(res));
            return;
        }

        for(int j=0;j<n;j++){
            if(!check(res,n,lev,j)){
                continue;
            }
            res[lev][j]=1;
            findQueen(lists,res,n,lev+1);
            res[lev][j]=0;


        }

    }

    /* 是否可以在 board[row][col] 放置皇后？ */
    public static  boolean check(int[][] one, int n,int row, int col) {

        // 检查列是否有皇后互相冲突
        for (int i = 0; i < row; i++) {
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

    public List<String> toList(int[][] res){
        List<String> list=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<res.length;i++){
            sb.setLength(0);
            for(int j=0;j<res.length;j++){
                if(res[i][j]==0){
                    sb.append(".");
                }else{
                    sb.append("Q");
                }
            }
            list.add(sb.toString());
        }
        return list;
    }


}
