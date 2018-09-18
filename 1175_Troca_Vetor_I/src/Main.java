
import java.util.Scanner;

/*
 * Desafio: 1175 Troca em Vetor II
 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro
 * elemento com o último, o segundo elemento com o penúltimo, etc., até trocar
 * o 10º com o 11º. Mostre o vetor modificado.
 * 
 * Entrada: A entrada contém 20 valores inteiros, positivos ou negativos.
 * 
 * Saída: Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição 
 * do vetor e Y é o valor armazenado naquela posição.
*/

/**
 * @author gilberto
 * @since 2018-09-18
 * @version 0.1
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n[] = new int[20];
        
        for (int i = 19; i >= 0; i--) {
            //System.out.println(i); 
            n[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + (i) + "] = " + n[i]);
        }
    }
}
