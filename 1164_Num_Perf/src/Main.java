
import java.util.Scanner;

/*
 * Desafio: 1164 Número Perfeito
 * Na matemática, um número perfeito é um número inteiro para o qual a soma de
 * todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao
 * próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
 * Sua tarefa é escrever um programa que imprima se um determinado número é
 * perfeito ou não.
 * 
 * Entrada: A entrada contém vários casos de teste. A primeira linha da entrada
 * contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da
 * entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤
 * 108), que pode ser ou não, um número perfeito.
 * 
 * Saída: Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito”
 * ou “X nao eh perfeito”, de acordo com a especificação fornecida.
*/

/**
 * @author gilberto
 * @since 2018-07-27
 * @version 0.1
 */ 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++) {
            int y = sc.nextInt();
            int soma = 0;
            
            for (int j = 1; j < y; j++) {
                if((y%j) == 0)
                    soma += j;
            }
            if(soma == y)
                System.out.println(y + " eh perfeito");
            else
                System.out.println(y + " nao eh perfeito");
        }
    }
}
