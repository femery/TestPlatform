package DFS.t104;

/**
 * @Auther: hsx
 * @Date: 2019/12/24
 * @Description: 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class t104 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftDep = maxDepth(root.left);
        int rightDep = maxDepth(root.right);

        return Math.max(leftDep,rightDep)+1;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
