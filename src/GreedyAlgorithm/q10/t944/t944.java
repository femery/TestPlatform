package GreedyAlgorithm.q10.t944;

/**
 * @Auther: hsx
 * @Date: 2019/12/9
 * @Description:
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 *
 * 删除 操作的定义是：选出一组要删掉的列，删去 A 中对应列中的所有字符，形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。
 *
 * 比如，有 A = ["abcdef", "uvwxyz"]，
 * 要删掉的列为 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。
 * 你需要选出一组要删掉的列 D，对 A 执行删除操作，使 A 中剩余的每一列都是 非降序 排列的，然后请你返回 D.length 的最小可能值。
 */
public class t944 {
    public static void main(String[] args) {
        t944 tt=new t944();
        String[] a={"zyx", "wvu", "tsr"};
        System.out.println(tt.minDeletionSize(a));

    }
    //返回要删除多少个组
    public int minDeletionSize(String[] A) {
        //列数
        int strLen=A[0].length();
        char[] max=new char[strLen];
        for(char m:max){
            m='a';
        }
        int res=0;

        for(int i=0;i<A.length;i++){
            char[] level=A[i].toCharArray();
            for(int j=0;j<strLen ;j++){
                if( max[j]!='0'){
                    if(level[j]>=max[j]){
                        max[j]=level[j];

                    }else{
                        res++;
                        max[j]='0';
                    }
                }

            }
        }


        return res;
    }







}
