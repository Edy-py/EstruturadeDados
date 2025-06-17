# Estrutura de Dados

Este repositório contém implementações de diversas estruturas de dados desenvolvidas durante a graduação em Ciência da Computação na Universidade Federal de Catalão (UFCAT).

## Autor

Edílson Alves da Silva
Graduando do 3º período de Ciência da Computação - UFCAT

## Estruturas de Dados Implementadas

O repositório inclui as seguintes implementações:

* **Deque**: Uma fila de duas pontas, permitindo a inserção e remoção de elementos em ambas as extremidades.
* **Fila (Queue)**: Uma estrutura de dados FIFO (First-In, First-Out), onde o primeiro elemento a ser inserido é o primeiro a ser removido.
* **Lista Circular (Circular Linked List)**: Uma lista encadeada onde o último nó aponta para o primeiro nó, formando um ciclo.
* **Lista Duplamente Encadeada (Doubly Linked List)**: Uma lista encadeada onde cada nó possui referências tanto para o próximo quanto para o nó anterior.
* **Lista Simplesmente Encadeada (Singly Linked List)**: Uma lista encadeada onde cada nó contém um dado e uma referência (ou link) para o próximo nó da sequência.
* **Matriz (Matrix)**: Exemplos de manipulação e impressão de matrizes em Java.
* **Pilha (Stack)**: Uma estrutura de dados LIFO (Last-In, First-Out), onde o último elemento a ser inserido é o primeiro a ser removido.

## Como Usar

Cada estrutura de dados está localizada em seu próprio diretório, contendo os arquivos `.java` necessários para a implementação e um arquivo `Start.java` para exemplificar o uso.

Para compilar e executar os exemplos:

1.  Navegue até o diretório da estrutura de dados desejada (por exemplo, `Deque`).
2.  Compile os arquivos `.java`: `javac *.java`
3.  Execute o arquivo `Start.java`: `java Start`

## Conteúdo do Repositório
.
├── Deque
│   ├── Deque.java
│   ├── Node.java
│   └── Start.java
├── Fila
│   ├── Fila.java
│   ├── Node.java
│   └── Start.java
├── ListaCircular
│   └── src
│       ├── Node.java
│       ├── SimpleCircleList.java
│       └── Start.java
├── ListaDuplamenteEncadeada
│   ├── DobbleLinkedList.java
│   ├── Node.java
│   └── Start.java
├── ListaSimplesmenteEncadeada
│   ├── Node.java
│   ├── SimpleLinkedList.java
│   └── Start.java
├── MatrizJava
│   └── MatrizJava.java
├── Pilha
│   ├── Node.java
│   ├── Pilha.java
│   └── Start.java
└── README.md
