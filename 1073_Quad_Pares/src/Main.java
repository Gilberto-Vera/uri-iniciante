
import java.util.Scanner;

/*
 * Desafio: 1073 Quadrado de Pares
 * 
 * Entrada: A entrada contém um valor inteiro N (5 < N < 2000).
 * 
 * Saída: Imprima o quadrado de cada um dos valores pares, de 1 até N.
 */

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = ler.nextInt();
        
        for(int i = 1; i <= num; i++){
            if((i % 2) == 0)
                System.out.println(i + "^2 = " + (i * i));
        }
    }
}
