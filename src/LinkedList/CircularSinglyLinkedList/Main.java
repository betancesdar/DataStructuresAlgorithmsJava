package LinkedList.CircularSinglyLinkedList;

public class Main {
    public static void main(String [] args){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSinglyLinkedList(4);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);

    }
}
