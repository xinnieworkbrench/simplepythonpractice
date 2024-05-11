package Chapter_2;

public class Palindrome {
    public static void main(String[] args){
        ListNode l = new ListNode();
        ListNode p = l;
        int[] element = {1,3,6,4,1};

        for(int i = 0; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }
        boolean res = Is_Palindrome(p.next);
        //test case
        System.out.println(res);
    }

    private static boolean Is_Palindrome(ListNode head){
        System.out.println(head.val);
        int count = 0;
        ListNode p1 = head;
        ListNode p2 = head;

        while(p1 != null){
            count += 1;
            p1 = p1.next;
        }
        //System.out.println(count);
        int idx = count / 2; //3
        int copy = idx;

        if(count % 2 == 0){
            idx = idx - 1;
        }

        while (idx >=0){
            p2 = p2.next;
            idx--;
        }
        ListNode r = reverse(p2);
        while(copy > 0){
            System.out.println(r.val + "----" + head.val);
            if(r.val != head.val){
                return false;
            }
            r = r.next;
            head = head.next;
            copy--;
        }
        return true;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode t = head.next;
            head.next = prev;
            prev = head;
            head = t;
        }


        return prev;
    }
}
