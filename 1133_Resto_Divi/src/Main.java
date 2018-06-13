
import java.util.Scanner;

/*
 * Desafio: 1133 Resto da Divisão
 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores
 * entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.
 * 
 * Entrada: O arquivo de entrada contém 2 valores positivos inteiros quaisquer,
 * não necessariamente em ordem crescente.
 * Saída: Imprima todos os valores conforme exemplo abaixo, sempre em ordem
 * crescente.
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
        
        if(x > y){
            for (int i = y + 1; i < x; i++) {
                if((i % 5) == 2 || (i % 5) == 3){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = x + 1; i < y; i++) {
                if((i % 5) == 2 || (i % 5) == 3){
                    System.out.println(i);
                }
            }
        }
    }
}
