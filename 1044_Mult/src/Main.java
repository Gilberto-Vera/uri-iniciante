
import java.util.Scanner;

/*
 * Desafio: 1044 Múltiplo
 * Descrição: O código lê 2 valores inteiros (A e B). Após, o programa mostra
 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
 * lidos são múltiplos entre si.
 */

/**
 * @author gilberto
 * @since 2018-04-27
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        if((b % a) == 0 || (a % b) == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}