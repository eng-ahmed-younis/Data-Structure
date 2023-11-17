package list.linked_base.enhanced_linked_list;

import list.IList;
import list.linked_base.ListNode;

public class AdvancedLinkedList<Type> implements IList<Type> {

    private int size;
    private ListNode head;
    private int currentPos;
    private ListNode current;

    public AdvancedLinkedList(){
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
                this.currentPos = 0; //new
                this.current = this.head; //new
            }else {
                if (p <= currentPos){ //reset
                    currentPos = 0;
                    current = this.head;
                }
                for (; currentPos != p-1 ; currentPos++)
                    current = current.next;
                // current  = p-1
                node.next = current.next;
                current.next = node;
            }
        }
        this.size++;
    }

    @Override
    public Type deleteList(int position) {
        ListNode<Type> pn , temp;
        Type item;
        if(position ==0){
            item = (Type) this.head.entry;
            current = this.head.next;
            currentPos = 0;
            free(this.head);
            this.head = current;
        }else {
            if (position <= position){
                currentPos = 0;
                current = this.current;
            }
            for (;currentPos < position-1 ; currentPos++){
                current = current.next;
            }
            item = (Type) current.next.entry;
            temp = current.next.next; // node after pos
            free(current.next);
            current.next = temp;
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
    }

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
        for (int i = 0 ; i<pos;i++)
            pn = pn.next;
        // after loop pn  = pos
        pn.entry = element;
    }
}
