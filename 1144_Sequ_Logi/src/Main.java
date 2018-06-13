
import java.util.Scanner;

/*
 * Desafio: 1144 Sequência Lógica
 * Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão
 * apresentadas na execução do programa, seguindo a lógica do exemplo abaixo.
 * Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.
 * 
 * Entrada: O arquivo de entrada contém um número inteiro positivo N (1 < N <
 * 1000).
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
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + i * i + " " + i * i * i);
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
        }
    }
}
