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

public class SearchInLL {

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

    private static boolean searchInLL(Node head, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node head = convertArr2LL(arr);

        int val = 6;

        if (searchInLL(head, val)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}