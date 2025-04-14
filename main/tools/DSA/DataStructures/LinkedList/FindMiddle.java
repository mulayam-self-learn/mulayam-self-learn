package main.tools.DSA.DataStructures.LinkedList;



public class FindMiddle {
    public static void main(String[] args) {
        //   1 2 3 4 5 6 7
        Node head = new Node();
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next.next=new Node(8);
        Node temp = middleNode(head);

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static Node middleNode(Node head) {
        Node middle =head;
        Node end =head;
        if(head == null || head.next == null)
            return head;
        while( end.next != null && end.next.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        if(end.next != null){
            return middle.next;
        }else return middle.next;
    }
}
