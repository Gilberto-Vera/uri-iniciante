
import java.util.Scanner;

/*
 * Desafio: 1142 PUM
 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de
 * linhas de saída que serão apresentadas na execução do programa.
 * 
 * Entrada: O arquivo de entrada contém um número inteiro positivo N.
 * 
 * Saída: Imprima a saída conforme o exemplo fornecido.
*/

/**
 * @author gilberto
 * @since 2018-06-13
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        
        for (int i = 1; i <= n * 4; i++) {
            if((i % 4) == 0)
                System.out.println("PUM");
            else
                System.out.print(i + " ");
        }   
    }
}
