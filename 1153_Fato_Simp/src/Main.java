
import java.util.Scanner;

/*
 * Desafio: 1153 Fatorial Simples
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
 * N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * 
 * Entrada: A entrada contém um valor inteiro N (0 < N < 13).
 * 
 * Saída: A saída contém um valor inteiro, correspondente ao fatorial de N.
*/

/**
 * @author gilberto
 * @since 2018-06-21
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        int fato = n;
        
        for (int i = n - 1; i > 0; i--) {
            fato *= i;
        }
        
        System.out.println(fato);
    }
    
}
