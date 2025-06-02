package src;

public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleCircleList listaExemplo = new SimpleCircleList();

        Node n1 = new Node("Rafael");
        listaExemplo.add(n1);
        Node n2 = new Node("Ana");
        listaExemplo.add(n2);
        Node n3 = new Node("Ricardo");
        listaExemplo.add(n3);

        Node n4 = new Node("Lorenzo");
        listaExemplo.add(n4);
        Node n5 = new Node("Lorena");
        listaExemplo.add(n5);

        System.out.println(listaExemplo);

        System.out.println(listaExemplo.getSize());
        listaExemplo.remove();
        System.out.println(listaExemplo);
        listaExemplo.remove();
        System.out.println(listaExemplo);
        listaExemplo.remove();
        listaExemplo.remove();
        listaExemplo.remove();
        listaExemplo.remove();
        System.out.println(listaExemplo);
        System.out.println(listaExemplo.getSize());

    }

}