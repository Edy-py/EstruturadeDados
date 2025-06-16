package Pilha;


public class Pilha {
    protected Node head;
    protected Node tail;
    private int size=0;
    public Pilha() {
        super();
    }
    public int getSize() {
        return size;
    }

    public void Push(Node v) {
        if (size == 0) {
            head = tail = v;
            size++;
            return;
        }
        tail.setNext(v);
        tail = v;
        size++;
    }

    public Node Pop() {
        if (size == 0) {
            return null;
        }
        //descobrindo o penultimo
        Node penultimate = head;
        Node retornoPop = tail;
        for (int i=1; i < size-1; i++)
            penultimate = penultimate.getNext();

        tail = penultimate;
        tail.setNext(null);
        size--;

        return retornoPop;

    }

    public Node Top(){
        return head;
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