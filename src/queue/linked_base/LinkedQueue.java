package queue.linked_base;

import queue.IQueue;

public class LinkedQueue <Type> implements IQueue<Type> {
    private QueueNode front,rear;
    private int size;

    public LinkedQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    @Override
    public void append(Type element) {
        // create node
        QueueNode<Type> node = new QueueNode();
        node.entry = element;
        node.next = null;
        // check if rear and front is null then front and rear refer to same node
        if (this.rear == null){
            this.front = node;
        }else {
            this.rear.next = node;
        }
        this.rear = node;
        this.size++;
    }


    @Override
    public Type serve() {
        QueueNode pn = this.front;
        Type item = (Type) this.front.entry;
        this.front = this.front.next;
        free(pn);
        // if front become null
        if (this.front == null)
            this.rear = null;
        this.size--;
        return item;
    }


    @Override
    public int queueSize() {
        return this.size;
    }

    @Override
    public void clearQueue() {
        while (this.front != null){
            this.rear = this.front.next;
            free(this.front);
            this.front = this.rear;
        }
        this.size = 0;
    }

    @Override
    public boolean queueEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean queueFull() {
        return false;
    }

    @Override
    public Type queueFront() {
        return (Type) this.front.entry;
    }

    @Override
    public void traverseQueue() {
        QueueNode pn = this.front;
        while (pn != null){
            System.out.println(pn.entry);
            pn = pn.next;
        }
    }
}
