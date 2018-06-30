
import java.util.Scanner;

/*
 * Desafio: 1080 Maior Posição
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição
 * dentre os 100 valores lidos.
 * 
 * Entrada: O arquivo de entrada contém 100 números inteiros, positivos e
 * distintos.
 * 
 * Saída: Apresente o maior valor lido e a posição de entrada.
*/

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int maior = ler.nextInt();
        int posi = 1;
        
        for(int i = 1; i < 100; i++){
            int x = ler.nextInt();
            if(x > maior){
                maior = x;
                posi = i + 1;
            }
        }
        
        System.out.println(maior);
        System.out.println(posi);
    }
}
