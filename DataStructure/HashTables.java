package DataStructure;

public class HashTables {
    
    public static final int MAX_LENGTH = 10;


    static class Node{
        int data;
        Node next;
    }

    public static int hash_function(int k, int n){
        return (k+1) % n;
    }
    public static void main(String[] args){
        int k = 0;
        Node[] items = new Node[HashTables.MAX_LENGTH];
        int arr[] = {65,34,5,6,2,7,2,4,6,7,4,3,22,33,5,6,7,45,3,525,6,7,3,2};

        for(int x: arr){
            k = hash_function(k, MAX_LENGTH);
            items[k] = insert_value(items[k], x);
        }
        print_table(items);
    }

    public static Node insert_value(Node item, int val){
        if (item == null) {
            Node p = new Node();
            p.data = val;
            p.next= null;
            return p;
        }
        Node p = item;
        while(p.next!=null){
            p = p.next;
        }
        Node temp = new Node();
        temp.data = val;
        p.next = temp;
        temp.next = null;
        return item;
    }

    public static void print_table(Node[] items){
        for(int i=0;i<MAX_LENGTH;i++){
            Node p = items[i];
            System.out.print("hash " +i + " :");
            while(p != null){
                System.out.print(" -> "+p.data);
                p = p.next;
            }
            System.out.println();
        }
    }
}
