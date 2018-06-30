
import java.util.Scanner;

/*
 * Desafio: 1149 Somando Inteiros Consecutivos
 * Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A para
 * cada i com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO, um
 * novo N(apenas N) deve ser lido.
 * 
 * Entrada: A entrada contém somente valores inteiros, podendo ser positivos ou
 * negativos. Todos os valores estão na mesma linha.
 * 
 * Saída: A saída contém apenas um valor inteiro.
*/

/**
 * @author gilberto
 * @since 2018-06-14
 * @version 0.1
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int n = ler.nextInt();
        int soma = 0;
        
        while(n <= 0){
            n = ler.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            soma += a + i;
        }
        System.out.println(soma);
    }
}
