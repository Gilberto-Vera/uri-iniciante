
import java.util.Scanner;

/*
 * Desafio: 1078 Tabuada
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
 * 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 * 
 * Entrada: A entrada contém um valor inteiro N (2 < N < 1000).
 * 
 * Saída: Imprima a tabuada de N, conforme o exemplo fornecido.
 * 1 x 140 = 140
 * 2 x 140 = 280
 * 3 x 140 = 420
 * 4 x 140 = 560
 * 5 x 140 = 700
 * 6 x 140 = 840
 * 7 x 140 = 980
 * 8 x 140 = 1120
 * 9 x 140 = 1260
 * 10 x 140 = 1400
 */

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        
        for(int i = 0; i < 10; i++){
            System.out.println((i + 1) + " x " + n + " = " + (n * (i + 1)));
        }
    }
}
