class stack {
    int size = 5;
    int st[] = new int[size];
    int top = -1;

    public void push(int x) {

        if (top >= size)
            System.out.println("stack is full");
        top = top + 1;
        st[top] = x;
    }

    public int pop() {
        if (top == -1)
            return -1;
        return top = top - 1;
    }

    public void Size() {
        System.out.println(top + 1);
    }

    public int Top() {
        if (top == -1)
            return -1;
        return st[top];
    }
}

public class Stack_Implementaion {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(3);
        s.push(4);

        // s.pop();
        System.out.println(s.Top());
        s.Size();

    }
}
