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

public class RemoveKthElementOfLL {

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
    private static Node removek(Node head , int k){
        if(head == null ) return head;
        if(k == 1){
            Node temp = head;
            head = head.next;
              return head;
        }
      int count = 0;
      Node temp = head;
      Node prev = null;
      while(temp != null){
        count++;
         if(count == k){
            prev.next = prev.next.next;
            break;
         }
         prev = temp;
         temp = temp.next;
      }
      return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node head = convertArr2LL(arr);
       head = removek(head,3);
        
        print(head);
    }
}