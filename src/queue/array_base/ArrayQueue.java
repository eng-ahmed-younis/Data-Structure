package queue.array_base;

import queue.IQueue;

public class ArrayQueue <Type> implements IQueue<Type> {
    private final int Max_Queue;
    private Type [] entry;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int queueSize){
        this.Max_Queue = queueSize;
        this.initQueue();
    }

    private void initQueue() {
         entry = (Type[]) new Object[Max_Queue];
        this.size = 0;
        this.front = 0;
        // refer to index than can add element after it
        this.rear = -1;
    }


    @Override
    public void append(Type element) {
        this.rear = (this.rear + 1) % Max_Queue;
        this.entry[this.rear] = element;
        this.size++;

    }

    @Override
    public Type serve() {
        // if the front = 0 ..... in this case must check if queue is empty ... empty don`t serve()
        Type temp = this.entry[this.front];
        this.front = (this.front + 1) % Max_Queue;
        this.size --;
        return temp;
    }

    @Override
    public int queueSize() {
        return this.size;
    }

    @Override
    public void clearQueue() {
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public boolean queueEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean queueFull() {
        return this.size == Max_Queue;
    }

    @Override
    public Type queueFront() {
        return this.entry[this.front];
    }

    @Override
    public void traverseQueue() {
        int pos , s ;
        for (pos = this.front , s = 0 ; s < this.size ; s++){
            System.out.println(this.entry[pos]);
            pos = (pos + 1) % Max_Queue;
        }
    }
}
