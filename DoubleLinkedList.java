class node {
    int data;
    node next;
    node back;

    node(int data, node next, node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoubleLinkedList {
    public static node convert(int arr[]) {
        node head = new node(arr[0]);
        node prev = head;
        for (int i = 1; i < arr.length; i++) {
            node temp = new node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        node head = convert(arr);
        print(head);
    }
}
