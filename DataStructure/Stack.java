package DataStructure;

public class Stack{
    static class Node{
        Node prev;
        int data;
    }
    public static void main(String[] args){
        Node stack = new Node();
        stack = push(stack,10);
        stack = push(stack,9);
        stack = push(stack,8);
        stack = pop(stack);
        stack = pop(stack);
        stack = pop(stack);
    }

    public static Node push(Node head, int val){
        Node temp = new Node();
        temp.prev = head;
        temp.data = val;
        System.out.println("Pushed "+ temp.data);
        return temp;
    }
    public static Node pop(Node head){
        Node temp = head.prev;
        System.out.println("Poped "+ head.data);
        head = null;
        return temp;
    }

}