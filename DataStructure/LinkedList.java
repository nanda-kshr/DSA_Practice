package DataStructure;

// Insertion, Deletion and Traversal of a Linked List
public class LinkedList {
    static class Node{
        Node next;
        int data;
    }
    public static void main(String[] args){
        Node myList = new Node();
        myList.data = 5; // Initialize the head node with data
        traverse(myList);
        insert(myList, 7);
        System.out.println("Inserting elements into the linked list:");
        traverse(myList);
        insert(myList, 3);
        insert(myList, 4);
        traverse(myList);
        insert(myList, 0);
        delete(myList);
        delete(myList);
        delete(myList);
        traverse(myList);

    }

    public static void insert(Node head, int val){
        Node p=head;
        while(p.next != null){
            p=p.next;
        }
        p.next = new Node();
        p.next.data = val;
    }
    public static void traverse(Node head){
        Node p = head;
        while(p != null){
            System.out.println(p.data);
            p=p.next;
        }
    }
    public static void delete(Node head){
        if(head.next == null) return; // Cannot delete if only head exists
        Node p = head;
        while(p.next.next != null){
            p=p.next;
        }
        p.next = null;
    }
}
