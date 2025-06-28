import java.util.Vector;

public class Lab6<T> {
    private Vector<T> queue;

    public Lab6(int initialCapacity) {
        queue = new Vector<>(initialCapacity);
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.remove(0);
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        Lab6<Integer> queue = new Lab6<>(2);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
