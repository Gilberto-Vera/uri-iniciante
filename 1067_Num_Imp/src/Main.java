
import java.util.Scanner;

/*
 * Desafio: 1067 Números Ímpares
 * 
 * Entrada: O arquivo de entrada contém 1 valor inteiro qualquer.
 * 
 * Saída: Imprima todos os valores ímpares de 1 até X, inclusive X, se for o
 * caso.
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = ler.nextInt();
        
        for(int i = 1; i <= num; i++){
            if((i % 2) != 0)
                System.out.println(i);      
        }
    }
}
