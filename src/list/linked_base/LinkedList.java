/*
package list.linked_base;

import list.IList;

public class LinkedList <Type> implements IList<Type> {

    private int size;
    private ListNode head;

    public LinkedList(){
        this.size = 0;
        this.head = null;
    }
    @Override
    public void insertList(int p, Type element) {
        ListNode<Type> node = new ListNode<>();
        ListNode<Type> pn = this.head;
        node.entry = element;
        node.next = null;
        if (node != null){
            if (p == 0){
                node.next = this.head;
                this.head = node;
            }else {
                for (int i =0; i<p-1;i++)
                    pn = pn.next;
                node.next = pn.next;
                pn.next = node;
            }
        }
        this.size++;

    }
*/
/*
    @Override
    public Type deleteList(int position) {
        ListNode<Type> pn , temp;
        Type item ;
        if(position ==0){
            pn = this.head;
            item = (Type) this.head.entry;
            this.head = this.head.next;
            free(pn);
        }else {
            temp = this.head;
            for (int i = 0; i<position-1; i++){
                temp = temp.next;
                item = (Type) temp.next.entry;
                pn = temp.next;
                temp = temp.next.next; // pos-1 refer to ----- pos+1
                free(pn);
            }
        }
        this.size--;
        return item;
    }

    @Override
    public boolean listEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean listFull() {
        return false;
    }

    @Override
    public int listSize() {
        return this.size;
    }*//*


    @Override
    public void destroyList() {
        ListNode pn = this.head;
        while (pn != null){
            this.head = this.head.next;
            free(pn);
            pn = this.head;
        }
        this.size = 0;
    }

    @Override
    public void traverseList() {

    }

    @Override
    public Type retreveList(int position) {
        Type item;
        ListNode<Type> pn = this.head;
        for (int i = 0 ; i<position;i++)
            pn = pn.next;
        // after loop pn  = pos
        item = pn.entry;
        return item;
    }

    @Override
    public void replaceList(int pos, Type element) {
        Type item;
        ListNode<Type> pn = this.head;
        for (int i = 0 ; i< pos;i++)
            pn = pn.next;
        // after loop pn  = pos
        pn.entry = element;
    }
}
*/
