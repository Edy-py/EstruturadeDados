package ListaSimplesmenteEncadeada;

public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleLinkedList listaExemplo = new SimpleLinkedList();

        Node n1 = new Node("Rafael");
        listaExemplo.addFirst(n1);
        Node n2 = new Node("Ana");
        listaExemplo.addFirst(n2);
        Node n3 = new Node("Ricardo");
        listaExemplo.addFirst(n3);

        Node n4 = new Node("Lorenzo");
        listaExemplo.addLast(n4);
        Node n5 = new Node("Lorena");
        listaExemplo.addLast(n5);
        Node n6 = new Node("Thiago");
        listaExemplo.insertAfter(n3, n6);

        System.out.println(listaExemplo);
        listaExemplo.removeFromBack();
        System.out.println(listaExemplo.getSize());
        listaExemplo.removeFromBack();

        System.out.println(listaExemplo);

        System.out.println("head " + listaExemplo.head);
        System.out.println("tail " + listaExemplo.tail);
        System.out.println("size " + listaExemplo.getSize());

        listaExemplo.remove(n6);


        System.out.println(listaExemplo);
        listaExemplo.remove(n2);
        System.out.println(listaExemplo);
        listaExemplo.remove(n3);
        System.out.println(listaExemplo);

    }

}