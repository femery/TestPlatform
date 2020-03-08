package array.q10.t78;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/17
 * @Description: 78. 子集
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 * 示例:
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class t78 {
    public static void main(String[] args) {
        t78 tt=new t78();
        int[] nums={1,2,3};
        List<List<Integer>>  li=tt.subsets(nums);
        //System.out.println(tt.subsets(nums));
    }
        public List<List<Integer>> subsets(int[] nums) {
            int len=nums.length;
            List<List<Integer>> lists=new ArrayList<>();
            List<Integer> list =new ArrayList<>();
            FindSubs(0,lists,list,nums,len);
            return lists;
        }

        public void FindSubs(int index,List<List<Integer>> lists,List<Integer> list,int[] nums,int len){
            lists.add(new ArrayList<>(list));

            for(int i=index;i<len;i++){
                list.add(nums[i]);
                FindSubs(i+1,lists,list,nums,len);
                list.remove(list.size()-1);
            }
        }



}
