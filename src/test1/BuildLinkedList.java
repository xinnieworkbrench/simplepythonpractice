package test1;

public class BuildLinkedList {

    public static void main(String[] args){

        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        LinkedNode node = node1;
        while(node != null){
            System.out.print(node.value + ",");
            node = node.next;
        }

        LinkedNode node6 = new LinkedNode(5);

        LinkedNode ptr = node1;

//        while(ptr.value != node4.value){
//            ptr = ptr.next;
//        }
//        ptr.next = null;
//        ptr.next = node6;
//        node6.next = node5;
//        System.out.println();
//        while(node1 != null){
//            System.out.print(node1.value + ",");
//            node1 = node1.next;
//        }
        while(ptr.next != node3){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        ptr.next = node4;

        System.out.println();

        while(node1 != null){
            System.out.print(node1.value + ",");
            node1 = node1.next;
        }


    }
}
