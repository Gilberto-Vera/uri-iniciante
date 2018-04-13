import java.util.Scanner;
/*
 * Desafio: 1003 Soma Simples
 * Descrição: O código lê dois inteiros e apresenta a soma deles, idem 1001
 */

/**
 * @author gilberto
 * @since 09/03/2018
 * @version 0.1
 */

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
    }
    
}
