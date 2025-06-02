package ListaDuplamenteEncadeada;

public class DobbleLinkedList {
	protected Node head;
    protected Node tail; 	
    private int size=0;
	
	public DobbleLinkedList() {

		super();
	}
	public int getSize() {

		return size;
	}
	public void addFirst(Node v) {
		if (size ==0)
			tail = v;
		else
			head.setPrev(v);
		v.setNext(head);
		head = v;
		size++;
	}
	public void addLast(Node v) {
		if (size ==0) {
			addFirst(v);
			return;
		}
		else
			tail.setNext(v);
		v.setPrev(tail);
		tail = v;
		size++;
	}
	
	public void removeFirst() {
		if (size ==0)
			return;

		head = head.getNext();
		head.setPrev(null);
		if(size == 1)
			tail = null;
		size--;

	}
	
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