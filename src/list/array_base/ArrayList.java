package list.array_base;

import list.IList;

public class ArrayList <Type> implements IList<Type> {
    private int size;
    Type [] entry;
    private int MAX_LIST;

    public ArrayList(int size){
        this.MAX_LIST = size;
        entry = (Type[]) new Object[MAX_LIST];
        this.size = 0;
    }
    @Override
    public void insertList(int p, Type element) {
        int i;
        for(i = this.size-1; i>= p ; i--)
            this.entry[i+1] = this.entry[i];
        this.entry[p] = element;
        this.size++;
    }

    @Override
    public Type deleteList(int position) {
        int i;
        Type item = this.entry[position];
        for (i = position+1 ; i<= this.size-1 ; i++)
            this.entry[i-1] = this.entry[i];
        this.size--;
        return item;
    }

    @Override
    public boolean listEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean listFull() {
        return this.size == MAX_LIST;
    }

    @Override
    public int listSize() {
        return this.size;
    }

    @Override
    public void destroyList() {
        this.size = 0;
    }

    @Override
    public void traverseList() {
        for (int i = 0 ; i<= this.size-1 ; i++){
            System.out.println(this.entry[i]);
        }
    }

    @Override
    public Type retreveList(int position) {
        return this.entry[position];
    }

    @Override
    public void replaceList(int pos, Type element) {

    }
}
