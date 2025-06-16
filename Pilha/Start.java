package Pilha;


public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pilha pilhaExemplo = new Pilha();

        Node n1 = new Node("Rafael");
        pilhaExemplo.Push(n1);
        Node n2 = new Node("Ana");
        pilhaExemplo.Push(n2);
        Node n3 = new Node("Ricardo");
        pilhaExemplo.Push(n3);


        Node n4 = new Node("Lorenzo");
        pilhaExemplo.Push(n4);
        Node n5 = new Node("Lorena");
        pilhaExemplo.Push(n5);

        System.out.println(pilhaExemplo);
        pilhaExemplo.Pop();

        System.out.println(pilhaExemplo);
        pilhaExemplo.Pop();
        System.out.println(pilhaExemplo);
    }

}