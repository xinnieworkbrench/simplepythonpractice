package Chapter_2;

import java.util.List;

public class Return_Kth_to_Last {
    public static void main(String[] args){
        ListNode l = new ListNode(3);
        ListNode p = l;
        int[] element = {3,5,5,8,5,9,1,11,1};

        for(int i = 1; i < element.length; i++){
            l.next =new ListNode(element[i]);
            l = l.next;
        }

        int res = return_kth_to_last(p,3);
        System.out.println(res);
    }

    private static int return_kth_to_last(ListNode head, int index){
        ListNode curr = head;
        ListNode p1 = head;
        int count = 0;
        while(p1!=null){
            count +=1;
            p1 = p1.next;
        }

        int remain = count - index; //6

        while(remain > 0){
            curr = curr.next;
            remain-=1;

        }
        //System.out.println(curr.val);
        return curr.val;
    }



}
