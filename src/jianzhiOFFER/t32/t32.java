package jianzhiOFFER.t32;

import java.util.*;

/**
 * @Auther: hsx
 * @Date: 2020/2/18
 * @Description: 面试题32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t32 {
    public static void main(String[] args) {
    System.out.println();
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return null;
        }
        List<List<Integer>> lists =new ArrayList<>();
        Queue queue= new LinkedList<TreeNode>();
        queue.offer(root);
        while(queue.isEmpty()==false){
            List<Integer> list = new ArrayList<>();
            int len =queue.size();
            while(len>0){
                TreeNode ele= (TreeNode) queue.poll();
                if(ele.left!=null){
                    queue.offer(ele.left);
                }
                if(ele.right!=null){
                    queue.offer(ele.right);

                }
                len--;
                list.add(ele.val);
            }
            lists.add(new ArrayList(list));


        }
        return lists;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }