package jianzhiOFFER.tt55;

/**
 * @Auther: hsx
 * @Date: 2020/2/16
 * @Description: 面试题55 - I. 二叉树的深度
 * @version: 1.0
 */
public class tt55 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
