package ListaSimplesmenteEncadeada;

public class SimpleLinkedList {
    protected Node head;
    protected Node tail;
    private int size=0;
    public SimpleLinkedList() {
        super();
    }
    public int getSize() {
        return size;
    }
    public void addFirst(Node v) {
        if (size ==0)
            tail = v;

        v.setNext(head);
        head = v;
        size = size + 1;
    }
    public void addLast(Node v) {
        tail.setNext(v);
        tail = v;
        size++;
    }

    public void removeFirst() {
        if (size !=0)  {
            head = head.getNext();
            size = size - 1;
        }
    }

    public void remove(Node v) {
        if (v == head)
            removeFirst();
        else if (v == tail)
            removeFromBack();
        else {
            //não é head e nem o tail
            //descobrir o anterior do v
            Node previousNode = head;
            while (previousNode.getNext() != v)
                previousNode = previousNode.getNext();

            previousNode.setNext(v.getNext());
            size--;
        }
    }

    public void insertAfter(Node v, Node newNode) {
        if (v == tail)
            tail= newNode;
        newNode.setNext(v.getNext());
        v.setNext(newNode);
        size++;
    }

    public void removeFromBack() {
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