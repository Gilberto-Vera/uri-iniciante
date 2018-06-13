
import java.util.Scanner;

/*
 * Desafio: 1145 Sequência Lógica 2 
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma
 * sequência de 1 até Y, passando para a próxima linha a cada X números.
 * 
 * Entrada: O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e
 * (X < Y < 100000).
 * 
 * Saída: Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em
 * branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em
 * branco após o último valor da linha.
*/

/**
 * @author gilberto
 * @since 2018-06-13
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int x = ler.nextInt();
        int y = ler.nextInt();
        
        for (int i = 1; i <= y; i++) {
            if((i % x) != 0)
                System.out.print(i + " ");
            else
                System.out.println(i);       
        }   
    }
}
