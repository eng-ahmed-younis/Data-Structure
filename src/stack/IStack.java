package stack;

import stack.array_base.ArrayStack;
import stack.linked_base.StackNode;

import java.util.ArrayList;

public interface IStack<T> {

    void initStack();
    void push(T element);
    T pop();
    boolean stackEmpty();
    boolean stackFull();
    int size();
    ArrayList<T> traverseStack();


    void clearStack();

    T stackTop();

    default void free(StackNode node){
        node = null;
        System.gc();
    }
}
