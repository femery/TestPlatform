package jianzhiOFFER.t28;

/**
 * @Auther: hsx
 * @Date: 2020/2/15
 * @Description: jianzhiOFFER.t28
 * @version: 1.0
 */
public class t28 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode one,TreeNode two){
        if(one==null && two ==null){
            return true;
        }
        if((one==null &&two!=null)|| (two ==null&& one!=null)){
            return false;
        }
        return one.val==two.val &&check(one.left,two.right) && check(one.right,two.left);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }