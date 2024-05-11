package Chapter_2;

public class Sum_List {
    public static void main(String[] args){
        ListNode l = new ListNode(9);
        ListNode p = l;
        int[] element = {9};

        ListNode l1 = new ListNode(9);
        ListNode p1 = l1;
        int[] element1 = {9,9};

        for(int i = 0; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }

        for(int i = 0; i < element1.length; i++){
            l1.next =new ListNode(element1[i]);
            l1 = l1.next;
        }
        ListNode res = sum_up(p,p1);

        //test case
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode sum_up(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;


        int carry = 0;

        while(head1 != null || head2 != null){
            int x = 0;
            int y = 0;
            if(head1 == null){
                x = 0;
            }
            else{
                x = head1.val;
            }

            if(head2 == null){
                y = 0;
            }
            else{
                y = head2.val;
            }
            int temp = x + y + carry;
            //System.out.println(temp);
            if(temp > 9){
                temp = temp % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            dummy.next = new ListNode(temp);
            dummy = dummy.next;
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;

        }

        if(carry == 1){
            dummy.next = new ListNode(1);
        }
        return res.next;
    }
}
