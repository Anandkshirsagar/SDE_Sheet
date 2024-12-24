class node {
    int data;
    node next;

    node(int data, node next) {
        this.data = data;
        this.next = next;
    }

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    public static node convertArrayToLinkedList(int arr[]) {
        node head = new node(arr[0]);
        node temp = head;
        for (int i = 1; i < arr.length; i++) {
            node t = new node(arr[i]);
            temp.next = t;
            temp = temp.next;
        }
        return head;
    }

    public static void print(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static node deleteHead(node head) {
        if (head == null)
            return null;
        head = head.next;
        return head;
    }

    public static node deleteTail(node head) {
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static node deleteK(node head, int k) {
        if (head == null)
            return head;
        if (k == 1)
            return head = head.next;
        node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if ((cnt + 1) == k) {
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        node head = convertArrayToLinkedList(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        head = deleteK(head, 2);
        print(head);
    }
}
