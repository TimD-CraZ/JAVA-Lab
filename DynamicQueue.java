package Tanmay;

public class DynamicQueue<T> {
    private T[] queue;
    private int size;
    private int capacity;

    public DynamicQueue(int initialCapacity) {
        capacity = initialCapacity;
        queue = (T[]) new Object[capacity];
        size = 0;
    }

    public void enqueue(T element) {
        if (size == capacity) {
            capacity *= 2;
            T[] newQueue = (T[]) new Object[capacity];
            System.arraycopy(queue, 0, newQueue, 0, size);
            queue = newQueue;
        }
        queue[size++] = element;
    }

    public T dequeue() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        T element = queue[0];
        System.arraycopy(queue, 1, queue, 0, size - 1);
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicQueue<Integer> queue = new DynamicQueue<>(2);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
