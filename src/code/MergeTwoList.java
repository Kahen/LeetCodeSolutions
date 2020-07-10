package code;

/**
 * @author: Kahen
 * @time: 2020/7/10 9:28
 */
public class MergeTwoList {
    public ListNode mergeByRecursive(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next = mergeByRecursive(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeByRecursive(list1, list2.next);
            return list2;
        }
    }
    public static void main(String[] args){
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(11);
        ListNode c = new ListNode(31);
        ListNode d = new ListNode(41);
        ListNode e = new ListNode(51);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode f = new ListNode(20);
        ListNode g = new ListNode(21);
        ListNode h = new ListNode(31);
        ListNode i = new ListNode(61);
        ListNode j = new ListNode(80);
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        new MergeTwoList().mergeByRecursive(a, f);
        while (a!=null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
