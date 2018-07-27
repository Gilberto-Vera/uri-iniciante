
import java.util.Scanner;

/*
 * Desafio: 1165 Número Primo
 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
 * (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
 * apenas pelo número 1 e pelo número 7.
 * 
 * Entrada: A entrada contém vários casos de teste. A primeira linha da entrada
 * contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da
 * entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤
 * 107), que pode ser ou não, um número primo.
 * 
 * Saída: Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou
 * “X nao eh primo”, de acordo com a especificação fornecida.
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
            int soma = 0, aux = 0;
            
            for (int j = 2; j <= y; j++) {
                if((y%j) == 0 && j != y){
                    aux = 1;
                    break;
                }
            }
            if(aux == 1)
                System.out.println(y + " nao eh primo");
            else
                System.out.println(y + " eh primo");
        }
    }
}
