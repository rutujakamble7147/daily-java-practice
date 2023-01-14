public class LinkedListExample {
    private static class Node{
      int data;
      Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
        void addNode (Node head , Node node){
        if (head == null){
            head = node;
        }else {
            Node ptr = head;
            while (ptr.next!= null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }
        void printList(Node head){
        if (head != null){
         Node temp = head;
            System.out.println("Head["+ head.next.hashCode()+"]-->");
            while (temp.next != null){
                System.out.println("["+ temp.data+"," +temp.next.hashCode()+"] -->");
                temp = temp.next;
            }
            System.out.println("["+temp.data+ "," + temp.next +"]-->");
            System.out.println("/n");
        }
    }

    public static void main(String[] args) {
        LinkedListExample.Node head = null;
        LinkedListExample.Node first = new LinkedListExample.Node(10,null);
        LinkedListExample.Node second = new LinkedListExample.Node(20,null);
        LinkedListExample.Node third = new LinkedListExample.Node(30,null);

        head = first;
        first.next = second;
        second.next = third;

        LinkedListExample LinkedList = new LinkedListExample();


        LinkedListExample linkedList = new LinkedListExample();

        linkedList.printList(head);

        LinkedListExample.Node fourth = new LinkedListExample.Node(40,null);
        linkedList.addNode(head, fourth);

        linkedList.printList(head);


    }

}


