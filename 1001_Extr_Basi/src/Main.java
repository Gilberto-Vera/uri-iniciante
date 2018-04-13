import java.util.Scanner;
/* 
 * Desafio: 1001 Extramamente Básico
 * Descrição: O código lê dois valores e apresenta a soma desses valores
 */

/**
 * @author gilberto
 * @since 2018-03-09
 * @version 0.1
 */
public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        System.out.println("X = " + (a + b));
        
    }
}