package stack.linked_base;

import stack.IStack;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class LinkedStack<Type> implements IStack<Type> {

    private StackNode top;
    private int size;

    public LinkedStack() {
        initStack();
    }


    @Override
    public void initStack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(Type element) {
        // pointer to new node
        StackNode<Type> node = new StackNode();
        node.entry = element;
        node.next = this.top;
        this.top = node;
        this.size ++;
    }

    @Override
    public Type pop() {
        Type item = (Type) this.top.entry;
        // pointer to current deleted node
        StackNode pn = this.top;
        this.top = this.top.next;
        free(pn);
        this.size--;
        return item;
    }

    @Override
    public boolean stackEmpty() {
        return this.top == null;
    }

    @Override
    public boolean stackFull() {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public ArrayList<Type> traverseStack() {
        ArrayList<Type> temp = new ArrayList<>();
        StackNode pn = this.top;
        while (pn != null){
            temp.add((Type) pn.entry);
            pn = pn.next;
        }
        return temp;
    }


    @Override
    public void clearStack() {
        StackNode pn = this.top;
        while (pn != null){
            pn = pn.next;
            free(this.top);
            this.top = pn;
        }
        this.size = 0;
    }


    @Override
    public Type stackTop() {
        return (Type) this.top.entry;
    }


}
