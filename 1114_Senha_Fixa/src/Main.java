
import java.util.Scanner;

/*
 * Desafio: 1113 Crescente e Decrescente
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
 * digitados em ordem crescente ou decrescente.
 * 
 * Entrada: A entrada contém vários casos de teste. Cada caso contém dois
 * valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores
 * iguais para X e Y.
 * 
 * Saída: Para cada caso de teste imprima “Crescente”, caso os valores tenham
 * sido digitados na ordem crescente, caso contrário imprima a mensagem
 * “Decrescente”.
*/

/**
 * @author gilberto
 * @since 2018-06-12
 * @version 0.1
 */ 
public class Main {
        
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        do{
            int m = ler.nextInt();
            int n = ler.nextInt();
            
            if(m != n){
                if(m < n)
                    System.out.println("Crescente");
                else
                    System.out.println("Decrescente");
            }else
                return;
        } while (true);
    }
}
