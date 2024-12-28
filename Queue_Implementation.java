class queue {
    int q[] = new int[5];
    int cur = 0;
    int start, end = -1;
    int size = q.length;

    public void push(int x) {
        if (cur >= size)
            System.out.println("queue overflow");
        if (cur == 0) {
            start = 0;
            end = 0;
            // q[end] = x;
            cur++;
        } else {
            end = (end + 1) % size;
            cur++;
            q[end] = x;

        }
    }

    public void siz() {
        System.out.println(cur);
    }

    public int top() {
        if (cur == 0)
            return -1;
        return q[start];
    }
}

public class Queue_Implementation {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(10);
        // q.push(20);
        // q.siz();
        System.out.println(q.top());
    }
}
