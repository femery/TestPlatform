package DFS.t797;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/23
 * @Description: 797. 所有可能的路径
 * 给一个有 n 个结点的有向无环图，找到所有从 0 到 n-1 的路径并输出（不要求按顺序）
 *
 * 二维数组的第 i 个数组中的单元都表示有向图中 i 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了a→b你就不能从b→a）空就是没有下一个结点了。
 *
 * 示例:
 * 输入: [[1,2], [3], [3], []]
 * 输出: [[0,1,3],[0,2,3]]
 * 解释: 图是这样的:
 * 0--->1
 * |    |
 * v    v
 * 2--->3
 * 这有两条路: 0 -> 1 -> 3 和 0 -> 2 -> 3.
 */
public class t797 {
    public static void main(String[] args) {
        t797 tt =new t797();
        int[][] graph={{1,2},{3},{3},{}};
        System.out.println(tt.allPathsSourceTarget(graph).toString());
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int len=graph.length;
        boolean[] flag=new boolean[len];
        PathFind(lists,list,graph,0,flag,len-1);
        return lists;

    }

    public void PathFind(List<List<Integer>> lists,List<Integer> list,int[][] graph,int pos,boolean[] flag,int des){
        flag[pos]=true;
        list.add(pos);
        if(pos==des){
            lists.add(new ArrayList<>(list));
        }else{
            for(int i:graph[pos]){
                if(!flag[i]){
                    PathFind(lists,list,graph,i,flag,des);
                }
            }
        }

        list.remove(list.size()-1);
        flag[pos]=false;

    }



}
