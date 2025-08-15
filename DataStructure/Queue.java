package DataStructure;

public class Queue{
    static class Node{
        Node next;
        int data;
        Node prev;
    }
    public static void main(String[] args){
        Node QueueHead = new Node();
        Node QueueTail = QueueHead;
        QueueTail = queue(QueueHead, QueueTail, 4);
        QueueTail = queue(QueueHead, QueueTail, 5);
        QueueHead = dequeue(QueueHead);
        QueueTail = queue(QueueHead, QueueTail, 5);
        QueueHead = dequeue(QueueHead);
        QueueHead = dequeue(QueueHead);
        QueueHead = dequeue(QueueHead);
        QueueHead = dequeue(QueueHead);
        

    }

    public static Node queue(Node head, Node tail, int val){
        if(head==tail && head.data == 0){
            head.data = val;
            display(head);
            return tail;
        }
        Node t = new Node();
        t.data = val;
        t.prev = null;
        tail.prev = t;
        t.next = tail;
        display(head);
        return t;
    }

    public static Node dequeue(Node head){
        if (head.prev == null) {
            System.out.println("Queue is empty, cannot dequeue.");
            return head;
        }
        Node temp = head.prev;
        temp.next = null;
        head.prev = null;
        head = temp;
        display(head);
        return head;
    }

    public static void display(Node head){
        do{
            System.out.print(head.data + ", ");
            head = head.prev;
        }
        while(head != null);
        System.out.println("");
    }
}