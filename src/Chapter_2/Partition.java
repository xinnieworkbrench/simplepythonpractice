package Chapter_2;

import java.util.List;

public class Partition {
    public static void main(String[] args){
        ListNode l = new ListNode(3);
        ListNode p = l;
        int[] element = {3,5,5,8,5,9,1,11,1};

        for(int i = 1; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }
        // p: 3,5,5,8,5,9,1,11,1
        // res: 3,5,8,9,1,11
        ListNode res = part(p, 8);

        //test case
        System.out.println("output");
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode part(ListNode head, int element){
        ListNode less = new ListNode();
        ListNode p1 = less;

        ListNode great = new ListNode();
        ListNode p2 = great;

        while(head != null){
            if(head.val < element){
                less.next = new ListNode(head.val);
                less = less.next;
            }
            else{
                great.next = new ListNode(head.val);
                great = great.next;
            }
            head = head.next;
        }
        p2 = p2.next;
        less.next = p2;
        return p1.next;
    }
}
