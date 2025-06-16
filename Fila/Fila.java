package Fila;

public class Fila {
    protected Node head;
    protected Node tail;
    private int size=0;

    public Fila() {

        super();
    }
    public int getSize() {

        return size;
    }
    /*
    public void addFirst(Node v) {
        if (size ==0)
            tail = v;
        else
            head.setPrev(v);
        v.setNext(head);
        head = v;
        size++;
    }

     */
    public void enqueue(Node v) {

        if(size==0){
            tail = v;
            head = v;
            size++;
            return;
        }
        tail.setPrev(v);
        v.setNext(tail);
        tail = v;
        size++;
    }

    public Node dequeue() {
        if (size ==0)
            return null;

        Node aux = head;
        tail = tail.getPrev();
        head.setPrev(null);
        if(size == 1)
            tail = null;
        size--;
        return aux;

    }

    /*
    public void remove(Node v) {

        if (v == head) {
            removeFirst();
            return;
        }
        if (v == tail) {
            removeFromBack();
            return;
        }


        Node prevNode = v.getPrev();
        prevNode.setNext(v.getNext());
        size--;

    }

    public void insertAfter(Node v, Node newNode) {
        if (v == tail) {
            addLast(newNode);
            return;
        }
        newNode.setNext(v.getNext());
        newNode.setPrev(v);
        v.setNext(newNode);
        size++;
    }



    public void removeFromBack() {
        //descobrindo o penultimo

        tail = tail.getPrev();
        tail.setNext(null);
        size--;
        if (size == 0) {
            tail = null;
            head = null;
        }
    }

 */
    public String toString() {
        String retorno = "";
        Node aux = head;
        for (int i =0; i < size; i++) {
            retorno += aux.getElement() + "  ";
            aux = aux.getPrev();
        }
        return retorno;
    }

}