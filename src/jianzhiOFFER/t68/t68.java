//package jianzhiOFFER.t68;
//
///**
// * @Auther: hsx
// * @Date: 2020/2/13
// * @Description: 面试题68 - I. 二叉搜索树的最近公共祖先
// * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
// * <p>
// * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
// * <p>
// * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
// * <p>
// * <p>
// * <p>
// *  
// * <p>
// * 示例 1:
// * <p>
// * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
// * 输出: 6
// * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
// * 示例 2:
// * <p>
// * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
// * 输出: 2
// * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
// * <p>
// * 来源：力扣（LeetCode）
// * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof
// * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
// */
//public class t68 {
//    public static void main(String[] args) {
//
//    }
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(p.val==root.val || q.val==root.val){
//            return root;
//        }
//        if(p.val>q.val){
//            if(p.val>root.val && q.val<root.val){
//               return root;
//            }
//
//        }else if(p.val<q.val){
//            if(p.val<root.val && q.val>root.val){
//                return root;
//            }
//
//        }else{
//            return p;
//        }
//        if(p.val<root.val){
//            return lowestCommonAncestor(root.left,p,q);
//        }else{
//            return lowestCommonAncestor(root.right,p,q);
//        }
//    }
//
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//}
