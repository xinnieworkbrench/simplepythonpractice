package Chapter_2;


import java.util.HashSet;
import java.util.List;

public class Remove_Dups {

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
        //ListNode res = R_Dup(p);
        R_Dup2(p);
        //test case
//        while(res != null){
//            System.out.println(res.val);
//            res = res.next;
//        }
    }

    private static ListNode R_Dup(ListNode head){
        HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        while(head.next != null){
            if(set.contains(head.val)){
                head = head.next;
                continue;
            }
            else{
                dummy.next = new ListNode(head.val);
                set.add(head.val);
                dummy = dummy.next;
            }
            head = head.next;
        }


        return res.next;
    }

    private static void R_Dup2(ListNode head){
        ListNode curr = head;
        while(curr != null){
            ListNode runner = curr;
            System.out.println("___________");
            while(runner.next != null){
                if(runner.next.val == curr.val){
                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }
                //System.out.println(runner.val);
            }
            //System.out.println(curr.val);
            curr = curr.next;
        }

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }



}