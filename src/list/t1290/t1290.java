package list.t1290;

/**
 * @Auther: hsx
 * @Date: 2019/12/18
 * @Description: 1290. 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *
 * 请你返回该链表所表示数字的 十进制值 。
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 * 示例 2：
 *
 * 输入：head = [0]
 * 输出：0
 * 示例 3：
 *
 * 输入：head = [1]
 * 输出：1
 * 示例 4：
 *
 * 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * 输出：18880
 *
 */
public class t1290 {
    public static void main(String[] args) {
        t1290 tt=new t1290();

    }

    public int getDecimalValue(ListNode head) {
        int res=0;
        int len=0;
        ListNode temp=head;
        while(temp.next !=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        while(temp.next !=null){
            if(temp.val==1){
                res+=Math.pow(2,len);
            }
            len--;
            temp=temp.next;
        }
        if(temp.val==1){
            res+=Math.pow(2,len);
        }

        return res;
    }


    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


}
