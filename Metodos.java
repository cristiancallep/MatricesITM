package MatricesITM;

public class Metodos {
    public int[][] captura(int d){
        int [][] matriz = new int[d][d];
        for (int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                matriz[i][j] = (int) (Math.random()*50+1);
            }
        }
        return matriz;
    }

    public void imprima(int[][] matriz){
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                System.out.print(" - " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void pares(int[][] matriz){
        System.out.print(" PARES: ");
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                if(matriz[i][j] % 2 == 0){
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public void impares(int[][] matriz){
        System.out.print(" IMPARES: ");
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz.length;j++){
                if(matriz[i][j] % 2 != 0){
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }


}