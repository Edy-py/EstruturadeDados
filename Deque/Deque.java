package Deque;

public class Deque {

    protected Node head;
    protected Node tail;
    private int size=0;


    public int getSize() {

        return size;
    }
    public void pushFront(Node v) {
        if (size ==0)
            tail = v;

        v.setNext(head);
        head = v;
        size++;
    }
    public void pushBack(Node v) {

        tail.setNext(v);
        tail = v;
        size++;
    }

    public void popFront() {
        if (size !=0)  {
            head = head.getNext();
            size = size - 1;
        }
    }

    public void popBack() {
        //descobrindo o penultimo
        Node penultimate = head;
        for (int i=1; i < size-1; i++)
            penultimate = penultimate.getNext();

        tail = penultimate;
        tail.setNext(null);
        size--;
        if (size == 0) {
            tail = null;
            head = null;
        }

    }

    public String toString() {
        String retorno = "";
        Node aux = head;
        for (int i =0; i < size; i++) {
            retorno += aux.getElement() + "  ";
            aux = aux.getNext();
        }
        return retorno;
    }

}

