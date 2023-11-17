package queue;

import queue.linked_base.QueueNode;
import stack.linked_base.StackNode;

public interface IQueue<T> {


    void append(T element);
    T serve();
    int queueSize();
    void clearQueue();
    boolean queueEmpty();
    boolean queueFull();
    T queueFront();

    void traverseQueue();


    default void free(QueueNode node){
        node = null;
        System.gc();
    }
}
