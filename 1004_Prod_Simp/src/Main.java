import java.util.Scanner;
/*
 * Desafio:1004 Produto Simples
 * Descrição: O código lê dois inteiros e apresenta a produto deles
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
        
        int prod = a * b;
        
        System.out.println("PROD = " + prod);
    }
    
}
