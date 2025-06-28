interface Stack {
    void push(int x);
    int pop();
    boolean isEmpty();
    int size();
}

class FixedStack implements Stack {
    int[] a = new int[3]; int top = -1;
    public void push(int x) {
        if (top < a.length - 1) a[++top] = x;
    }
    public int pop() {
        return top >= 0 ? a[top--] : -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}

class DynamicStack implements Stack {
    int[] a = new int[2]; int top = -1;
    public void push(int x) {
        if (top == a.length - 1) {
            int[] b = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) b[i] = a[i];
            a = b;
        }
        a[++top] = x;
    }
    public int pop() {
        return top >= 0 ? a[top--] : -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack s;

        s = new FixedStack();
        s.push(1); s.push(2); s.push(3);
        System.out.println("Fixed Pop: " + s.pop());
        System.out.println("Fixed Size: " + s.size());
        System.out.println("Is Empty: " + s.isEmpty());

        s = new DynamicStack();
        s.push(10); s.push(20); s.push(30);
        System.out.println("Dynamic Pop: " + s.pop());
        System.out.println("Dynamic Size: " + s.size());
        System.out.println("Is Empty: " + s.isEmpty());
    }
}