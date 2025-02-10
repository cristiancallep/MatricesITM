package MatricesITM;

public class Metodos {
    private int[][] matriz;  // Variable de instancia para almacenar la matriz

    // Método para capturar la matriz
    public void captura(int d) {
        matriz = new int[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
    }

    // Método para imprimir la matriz
    public void imprima() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" - " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Método para imprimir los números pares de la matriz
    public void pares() {
        System.out.print(" PARES: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Método para imprimir los números impares de la matriz
    public void impares() {
        System.out.print(" IMPARES: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}