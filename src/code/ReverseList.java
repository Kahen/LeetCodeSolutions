package code;

import java.util.LinkedList;

/**
 * @author: Kahen
 * @time: 2020/7/9 20:24
 */

public class ReverseList {
    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode next=null;


        while (head!=null){
            // 保存要反转到头的那个节点
            next = head.next;
// 要反转的那个节点指向已经反转的上⼀个节点(备注:第⼀次反转的时候

            head.next = pre;
// 上⼀个已经反转到头部的节点
            pre = head;
// ⼀直向链表尾⾛
            head = next;
        }

        return next;
    }
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        new ReverseList().reverseList(a);
        while (e!=null) {
            System.out.println(e.val);
            e = e.next;
        }
    }
}

