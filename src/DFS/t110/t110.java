package DFS.t110;

/**
 * @Auther: hsx
 * @Date: 2019/12/25
 * @Description: 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 */
public class t110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        boolean flag =true;
        int[] a=new int[1];
        deep(root,a);
        if(a[0]==0){
            return true;
        }else{
            return false;
        }
    }

    public int deep(TreeNode root,int[] a){
        if(root==null){
            return 0;
        }

        int leftlen=deep(root.left,a);
        int rightlen=deep(root.right,a);
        if(Math.abs(leftlen-rightlen)>1){
            a[0]=1;
        }
        return Math.max(leftlen,rightlen)+1;


    }
}


class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}