package Chapter_2;

public class Intersection {
    public static class Check{
        int val;
        ListNode tail;

        public Check(ListNode tail, int val){
            this.tail = tail;
            this.val = val;
        }

    }
    public static void main(String[] args){
        ListNode l = new ListNode(3);
        ListNode p = l;
        int[] element = {1,5,9,7,2,1};

        ListNode l1 = new ListNode(4);
        ListNode p1 = l1;
        int[] element1 = {6,7,2,1};

        for(int i = 0; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }

        for(int i = 0; i < element1.length; i++){
            l1.next =new ListNode(element1[i]);
            l1 = l1.next;
        }
        ListNode res = intersection(p,p1);

        //test case
        System.out.println(res.val);
    }



    private static Check Get_Tail_and_Value(ListNode head){
        if(head == null){
            return null;
        }
        int size = 1;
        ListNode curr = head;

        while(curr.next!= null){
            size += 1;
            curr = curr.next;
        }
        return new Check(curr, size);
    }

    private static ListNode getKthNode(ListNode head, int diff){
        ListNode curr = head;
        while(diff > 0 && curr != null){
            curr = curr.next;
            diff--;
        }
        return curr;
    }
    private static ListNode intersection(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null){
            return null;
        }
        Check r1 = Get_Tail_and_Value(head1);
        Check r2 = Get_Tail_and_Value(head2);

        if(r1.tail != r2.tail){
            return null;
        }
        ListNode shorter = r1.val < r2.val ? head1 : head2;
        ListNode longer = r1.val < r2.val ? head2 : head1;

        longer = getKthNode(longer, Math.abs(r1.val - r2.val));

        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }

}
