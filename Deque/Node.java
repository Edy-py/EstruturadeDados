package Deque;

public class Node {
    private String element;
    private Node next = null;
    private Node prev = null;

    public Node(String element) {

        this.element = element;
    }

    public String getElement() {

        return element;
    }

    public void setElement(String element) {

        this.element = element;
    }
    public Node getNext() {

        return next;
    }
    public void setNext(Node next) {

        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {

        return element ;
    }




}

