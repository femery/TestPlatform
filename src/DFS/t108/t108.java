package DFS.t108;


/**
 * @Auther: hsx
 * @Date: 2019/12/25
 * @Description: 108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class t108 {
    public static void main(String[] args) {
        t108 tt =new t108();

    }

    public TreeNodes sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }
    //综上，和之前一样，找到了根节点，然后把数组一分为二，进入递归即可。注意这里的边界情况，包括左边界，不包括右边界。
    private TreeNodes sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = (start + end) /2;
        TreeNodes root = new TreeNodes(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

}

class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes(int x) {
        val = x;
    }
}
