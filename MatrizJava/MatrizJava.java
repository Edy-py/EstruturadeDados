package MatrizJava;

public class MatrizJava {
    public static void main(String[] args) {
        // matriz
        String [][] matriz = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = "*";

            }
        }
        // matriz a
        System.out.println("Matriz A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ( j>0  && j<3 && i != 0 && i != 3) {
                    matriz[i][j] = " ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz C:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j<=i){
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
            }
}

