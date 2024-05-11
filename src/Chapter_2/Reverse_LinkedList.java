package Chapter_2;

public class Reverse_LinkedList {

    public static void main(String[] args){
        ListNode l = new ListNode(1);
        ListNode p = l;
        int[] element = {3,5,7,9};

        for(int i = 0; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }
        ListNode res = reverse(p);
        //test case
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next  = prev;
            prev = head;
            head = temp;
        }


        return prev;
    }
}
