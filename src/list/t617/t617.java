package list.t617;


/**
 * @Auther: hsx
 * @Date: 2020/1/2
 * @Description: list.t617
 * @version: 1.0
 */
public class t617 {
    public static void main(String[] args) {

    }

    public TreeNode2 mergeTrees(TreeNode2 t1, TreeNode2 t2) {
        if(t1== null){
            return t2;
        }
        if(t2 ==null){
            return t1;
        }
        t1.val=t1.val+t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }
}



class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int x) {
        val = x;
    }
}
