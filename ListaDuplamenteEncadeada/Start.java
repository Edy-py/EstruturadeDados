package ListaDuplamenteEncadeada;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DobbleLinkedList listaExemplo = new DobbleLinkedList();

		//add elementos no início
		Node n1 = new Node("Edilson");
		listaExemplo.addFirst(n1);
		Node n2 = new Node("Elio");
		listaExemplo.addFirst(n2);

		System.out.println(listaExemplo);


		// add elementos no final
		Node n3 = new Node("Gabriel");
		listaExemplo.addLast(n3);

		Node n4 = new Node("Marcos");
		listaExemplo.insertAfter(n2,n4);

		System.out.println(listaExemplo);

		listaExemplo.removeFirst();
		listaExemplo.removeFromBack();

		System.out.println(listaExemplo);
		

		
	}

}
