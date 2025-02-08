package MatricesITM;
import java.util.Scanner;

public class MatricesParesImpares {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("por favor ingrese la dimension de la matriz");
        n = sc.nextInt();
        Metodos m = new Metodos();
        int [][] matriz = new int[n][n];
       matriz = m.captura(n);
        m.imprima(matriz);
        m.pares(matriz);
        m.impares(matriz);
    }

}