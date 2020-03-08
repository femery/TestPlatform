package Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/7
 * @Description: test
 * @version: 1.0
 */
public class FullArray {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        permute(nums);
    }

   public static List<List<Integer>> res = new LinkedList<>();
   public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track);
        return res;
    }

    public  static  void backtrack(int[] nums ,LinkedList<Integer> track){
        if(track.size() == nums.length){
            res.add(new LinkedList(track));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            System.out.println(track);
            backtrack(nums,track);
            track.removeLast();
        }
    }

}
