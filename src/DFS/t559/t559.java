package DFS.t559;

import java.util.List;

/**
 * @Auther: hsx
 * @Date: 2019/12/24
 * @Description: DFS.t559
 * @version: 1.0
 */
public class t559 {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int max=0;
        for(Node node:root.children){
            max=Math.max(max,maxDepth(node));
        }
        return max+1;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};