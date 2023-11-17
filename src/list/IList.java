package list;

import list.linked_base.ListNode;
import queue.linked_base.QueueNode;

public interface IList <T>{
    void insertList(int p , T element);
    T deleteList(int position);
    boolean listEmpty();
    boolean listFull();
    int listSize();
    void destroyList();
    void traverseList();
    T retreveList(int position);
    void replaceList(int pos, T element);

    default void free(ListNode node){
        node = null;
        System.gc();
    }
}
