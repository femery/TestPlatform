package DFS.t109;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/25
 * @Description: 109. 有序链表转换二叉搜索树
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 *
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class t109 {
    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        List<Integer> list =new ArrayList<>();
        ListNode node=head;
        while(node.next !=null){
            list.add(node.val);
            node=node.next;
        }
        list.add(node.val);
        return sortTo(list,0,list.size());
    }

    public TreeNode sortTo(List<Integer> list,int start ,int end){
        if(start==end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode node =new TreeNode(list.get(mid));
        node.left=sortTo(list,start,mid);
        node.right=sortTo(list,mid+1,end);

        return node;
    }

}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
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
