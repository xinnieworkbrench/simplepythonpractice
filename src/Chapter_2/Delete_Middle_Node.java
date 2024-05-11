package Chapter_2;

public class Delete_Middle_Node {

    public static void main(String[] args){
        ListNode l = new ListNode(3);
        ListNode p = l;
        int[] element = {3,5,5,8,5,9,1,11,1,12};

        for(int i = 1; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }
        ListNode res = delete_middle_node(p);

        // Test
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode delete_middle_node(ListNode head){
        ListNode p = head;
        ListNode res = head;
        int count = 0;
        while(p != null){
            count += 1;
            p = p.next;
        }
        //System.out.println(count);
        if(count % 2 ==0){ //even
            int index = count / 2 - 2;
            while(index >  0){
                res = res.next;
                index --;
            }
            res.next = res.next.next;
        }
        else{ //odd
            int index = count / 2 - 1;
            while(index >  0){
                res = res.next;
                index --;
            }
            res.next = res.next.next;
        }

        return head;
    }
}
