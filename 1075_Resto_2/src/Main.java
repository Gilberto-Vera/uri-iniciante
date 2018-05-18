
import java.util.Scanner;

/*
 * Desafio: 1075 Resto 2
 * 
 * Entrada: A entrada contém um valor inteiro N (N < 10000).
 * 
 * Saída: Imprima todos valores entre 1 e 10000 que quando divididos por N dão
 * resto = 2, um por linha.
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
        
        for(int i = 2; i < 10000; i++){
            if((i % n) == 2)
                System.out.println(i);
        }
    }
}
