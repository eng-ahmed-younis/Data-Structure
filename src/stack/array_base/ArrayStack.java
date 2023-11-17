package stack.array_base;

import stack.IStack;

import java.util.ArrayList;

public class ArrayStack<Type> implements IStack<Type> , IArrayStack {
    private int top;
    private Type[] entry;
    private int MAX_STACK;
    private int size;




   public ArrayStack(int stackSize){
       this.MAX_STACK = stackSize;
       initStack();
   }


    // first create array of type object this base class in java
    // then cast return to array of generic type
    @Override
    public void initStack() {

        this.top = 0;
        this.size = 0;
        this.entry = (Type[]) new Object [MAX_STACK];
    }

    @Override
    public void push(Type element) {
        this.entry[this.top ++] = element;
        this.size++;
    }

    @Override
    public Type pop() {
        this.size --;
        return this.entry[--this.top];
    }

    @Override
    public boolean stackEmpty() {
        return this.top == 0;
    }

    @Override
    public boolean stackFull() {
        return this.top == this.MAX_STACK;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public ArrayList<Type> traverseStack() {
       ArrayList<Type> temp = new ArrayList<>();
            for (int i = this.top - 1; i <= 0; i++) {
                temp.add(this.entry[i]);
            }
        return temp;
    }

    @Override
    public int availableSpace() {
        System.out.println("max ia " + MAX_STACK);
        System.out.println("top ia " + top);
        return this.MAX_STACK - top;
    }

    @Override
    public void clearStack() {
        this.top = 0;
        this.size = 0;
    }

    @Override
    public Type stackTop() {
        return this.entry[this.top-1];
    }
}
