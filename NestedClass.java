
public class NestedClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node head = new LinkedList.Node();
        LinkedList.Node current = head;
        current.next = head;
        LinkedList.Node next = new LinkedList.Node();
        current.next.next = next;


    }

}


class LinkedList{
    Node head;
    LinkedList(){
        head = new Node();
    }
    static class Node{
        int data;
        public Node next;
    }
}