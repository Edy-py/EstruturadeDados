package Fila;

public class Start {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fila FilaExemplo = new Fila();

        //add elementos no início
        Node n1 = new Node("Edilson");
        FilaExemplo.enqueue(n1);
        Node n2 = new Node("Elio");
        FilaExemplo.enqueue(n2);
        FilaExemplo.dequeue();

        System.out.println(FilaExemplo);




    }

}
