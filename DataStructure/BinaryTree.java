package DataStructure;


public class BinaryTree {
    
    static class TNode{
        TNode LST;
        TNode RST;
        int data;
    }
    static class QNode{
        TNode data;
        QNode next;
    }

    public static void main(String[] args){
        int[] data = {5,3,2,1,2,3,4,7,6,33,3,5,6,2,2,3,5};
        TNode root = null;
        for (int val : data) {
            root = insert_element(root, val);
        }
        System.out.println("Level order traversal:");
        print_level_order(root);
    }
    
    static TNode insert_element(TNode root, int val){
        TNode newNode = new TNode();
        newNode.data = val;
        newNode.LST = null;
        newNode.RST = null;
        if (root==null){
            return newNode;
        }
        QNode queue = new QNode();
        queue.data = root;
        queue.next = null;
        while(queue!=null){
            TNode t = queue.data;
            if (t.LST == null){
                TNode tmp = new TNode(); 
                tmp.data = val;
                tmp.RST = null;
                tmp.LST = null;
                t.LST = tmp;
                return root;
            }
            else{
                queue = insert_in_Q(queue, queue.data.LST);
            }
            if (t.RST == null){
                TNode tmp = new TNode(); 
                tmp.data = val;
                tmp.RST = null;
                tmp.LST = null;
                t.RST = tmp;
                return root;
            }
            else {
                queue = insert_in_Q(queue, queue.data.RST);
            }
            queue = queue.next;
        }

        return newNode;
    }

    static QNode insert_in_Q(QNode head, TNode val){
        QNode temp = head;
        while(temp.next!=null){
            temp = temp.next; 
        }
        QNode newT = new QNode();
        newT.data = val;
        newT.next= null;
        temp.next = newT;
        return head;
    }

    static void print_level_order(TNode root) {
        if (root == null) return;
        QNode queue = new QNode();
        queue = insert_in_Q(queue,root);
        queue = queue.next; 
        while (queue != null) {
            TNode temp = queue.data;
            System.out.print(temp.data + " ");
            if (temp.LST != null) queue = insert_in_Q(queue, temp.LST);
            if (temp.RST != null) queue = insert_in_Q(queue, temp.RST);
            queue = queue.next;
        }
        System.out.println();
    }
}
