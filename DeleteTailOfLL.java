class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeleteTailOfLL {

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node removesHead(Node head) {
        if (head == null) return head;

        head = head.next;
        return head;
    }
    private static Node removeTail(Node head) {
        if(head == null || head.next == null ) 
            return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;

        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node head = convertArr2LL(arr);
       
        head = removeTail(head);
        print(head);
    }
}