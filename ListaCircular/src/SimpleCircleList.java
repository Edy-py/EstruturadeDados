package ListaCircular.src;

public class SimpleCircleList {
    private Node cursor = null;
    private int size=0;
    public SimpleCircleList() {
        super();
    }
    public int getSize() {
        return size;
    }

    public void advance() {
        if (size != 0)
            cursor = cursor.getNext();
    }
    public void add(Node newNode) {
        if (cursor == null) {
            newNode.setNext(newNode);
            cursor = newNode;
        } else {
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
        }
        advance();
        size++;
    }
    public void remove() {
        //remove o cursor
        if (size == 0)
            return;

        //descobrir o anterior do cursor
        Node previousNode = cursor;
        for (int i = 0; i < size-1; i++)
            previousNode = previousNode.getNext();

        //System.out.println("Cursor = " + cursor.getElement() + " anterior " + previousNode.getElement() );
        previousNode.setNext(cursor.getNext());
        size--;
    }


    public String toString() {
        advance();
        String retorno = "";
        Node aux = cursor;
        for (int i =0; i < size; i++) {
            retorno += aux.getElement() + "  ";
            aux = aux.getNext();
        }
        return retorno;
    }

}