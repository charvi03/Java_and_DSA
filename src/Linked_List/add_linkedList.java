package Linked_List;

public class add_linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //step 1= create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2==newnode next=head
        newNode.next = head;
        //step3 -head=newnode
        head = newNode;
    }

    public static void main(String[] args) {
        add_linkedList ll = new add_linkedList();
        ll.addFirst(1);
        ll.addFirst(2);

    }
}
