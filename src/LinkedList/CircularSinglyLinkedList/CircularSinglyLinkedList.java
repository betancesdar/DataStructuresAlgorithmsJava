package LinkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //create CircualrSinglyLinkedList
    public Node createCircularSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail= node;
        size = 1;
        return head;
    }
    //insertion CircularSinglyLinkedList
    public void insertNodeIntoCircularSinglyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            System.out.println("Circular Singly Linked list Does not exist");
            return;
        } else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        } else if(location >= size){

        }
    }

}
