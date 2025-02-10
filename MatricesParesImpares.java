package MatricesITM;
import java.util.Scanner;

public class MatricesParesImpares {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("por favor ingrese la dimension de la matriz");
        n = sc.nextInt();
        Metodos metodos = new Metodos();
        metodos.captura(n);  // Crear una matriz de nxn
        metodos.imprima();   // Imprimir la matriz
        metodos.pares();     // Imprimir los números pares
        metodos.impares();   // Imprimir los números impares
        sc.close();
    }

}