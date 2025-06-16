package Deque;


public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deque listaExemplo = new Deque();

        //add elementos no início
        Node n1 = new Node("Edilson");
        listaExemplo.pushFront(n1);
        Node n2 = new Node("Elio");
        listaExemplo.pushBack(n2);

        System.out.println(listaExemplo);


        // add elementos no final
        Node n3 = new Node("Gabriel");
        listaExemplo.pushBack(n3);

        Node n4 = new Node("Marcos");
        listaExemplo.pushBack(n4);

        System.out.println(listaExemplo);

        listaExemplo.popFront();
        listaExemplo.popBack();

        System.out.println(listaExemplo);



    }

}

