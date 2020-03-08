//package list.t23;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
///**
// * @Auther: hsx
// * @Date: 2020/1/27
// * @Description: 23. 合并K个排序链表
// * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
// * 示例:
// * 输入:
// * [
// *   1->4->5,
// *   1->3->4,
// *   2->6
// * ]
// * 输出: 1->1->2->3->4->4->5->6
// */
//public class t23 {
//    public static void main(String[] args) {
//
//        t23 tt =new t23();
//
//        ListNode l1=new ListNode(2);
//        ListNode l12=new ListNode(5);
//        ListNode l123=new ListNode(3);
//        l1.next=l12;
//        l12.next=l123;
//        ListNode[] lists =new ListNode[10];
//        lists[0]=l1;
//
//        ListNode r1=tt.mergeKLists(lists);
//        while(r1.next!=null){
//            System.out.println(r1.val);
//            r1=r1.next;
//        }
//        System.out.println(r1.val);
//
//    }
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode head = new ListNode(0);
//        ListNode p = new ListNode(0);
//        ListNode q = head;
//        //比较器
//        Comparator<ListNode> OrderIsdn =  new Comparator<ListNode>() {
//            @Override
//            public int compare(ListNode o1, ListNode o2) {
//                if(o1.val>o2.val){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };
//        //优先队列
//        Queue<ListNode> priorityQueue =  new PriorityQueue<ListNode>(OrderIsdn);
//        for(ListNode list:lists){
//            if(list!=null) {
//                priorityQueue.add(list);
//            }
//        }
//
//        while(priorityQueue.isEmpty()==false){
//            p=priorityQueue.poll();
//            int val=p.val;
//            if(p.next!=null){
//                p=p.next;
//                priorityQueue.add(p);
//            }
//
//
//            q.next= new ListNode(val);
//            q=q.next;
//
//        }
//
//
//        return head.next;
//    }
//}
//
//
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}
