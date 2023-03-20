package LinkedList.SinglyLinkedLink;

public class SinglyLinkedList {
    //we need to create the first reference of the linkedlist which are : Head and tails and comming from node
    public Node head;
    public Node tail;
    public int size; //Evrytime we add a new node to our Liked list this variable will increase in that way will know how many node we have


    //First Method: Create!
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Method of insert into a LinkedList

    public void insertNodeInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if(location==0){
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node temNode = head;
            int index = 0;
            while(index < location -1){
                temNode = temNode.next;
                index++;
            }
            Node nextNode = temNode.next;
            temNode.next = node;
            node.next = nextNode;
        }

        size++;

    }

    //Traversal
    //Time Complexity = O(n)
    //Space complexity = O(1)
    public void traverseSinglyLinkedList(){
        if(head == null){ //-------------> O(1)
            System.out.println("Single LinkedList does not exist");//-------------> O(1)
        }else{
            Node tempNode = head; //-------------> O(1)
            for(int i =0;  i < size; i++){ //-------------> O(n)
                System.out.print(tempNode.value); //-------------> O(1)
                if (i != size - 1){ //-------------> O(1)
                    System.out.print(" -> "); //-------------> O(1)
                }
                tempNode = tempNode.next; //-------------> O(1)
            }
        }
        System.out.println("\n"); //-------------> O(1)
    }

    //Search into Singly LinkedList
    //Time Complexity = O(n)
    //Space complexity = O(1)
    public boolean searchInSinglyLinkedList(int nodeValue){
        if(head != null){ //-------------> O(1)
            Node temNode = head;  //-------------> O(1)
            for(int i =0; i < size; i++){  //-------------> O(n)
                if(temNode.value == nodeValue){  //-------------> O(1)
                    System.out.print("Found node at location: "+ i+"\n"); //-------------> O(1)
                    return true; //-------------> O(1)
                }
                temNode = temNode.next; //-------------> O(1)

            }
        }
        System.out.println("Node not found"); //-------------> O(1)
        return false; //-------------> O(1)
    }
    //Delete a Node
    public void deletionOnNode(int location){
        if(head == null){
            System.out.println("LinkedList does not exist");
            return;
        } else if(location == 0){ //if the location it is 0 we wan t to delete the first
            //this logic will be to delete a node that has more that one in the linkedlist
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node temNode = head;
            for(int i=0; i < size -1; i++){
                temNode = temNode.next;
            }
            if (temNode == head){
                tail = head = null;
                size--;
                return;
            }
            temNode.next=null;
            tail=temNode;
            size--;
        }else{
            Node temNode = head;
            for (int i = 0; i < location-1; i++){
                temNode = temNode.next;
            }
            temNode.next = temNode.next.next;
            size--;
        }

    }
    //delete single linkedlist
    public void deleteSinglyLinkedList(){
        head = null;
        tail = null;
        System.out.println("The single LinkedList deleted");
    }



}

