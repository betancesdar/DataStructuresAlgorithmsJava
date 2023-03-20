package LinkedList.SinglyLinkedLink;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        //System.out.println(sLL.head.value);
        sLL.insertNodeInLinkedList(6,1);
        sLL.insertNodeInLinkedList(7,3);
        sLL.insertNodeInLinkedList(8,4);
        sLL.insertNodeInLinkedList(9,5);
        //System.out.println(sLL.head.next.next.value);
        sLL.traverseSinglyLinkedList();
        sLL.deletionOnNode(0);
        sLL.traverseSinglyLinkedList();

    }
}
