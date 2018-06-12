
import java.util.Scanner;

/*
 * Desafio: 1101 Sequência de Números e Soma
 * Leia um conjunto não determinado de pares de valores M e N (parar quando
 * algum dos valores for menor ou igual a zero). Para cada par lido, mostre a
 * sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
 * (incluindo o N e M).
 * 
 * Entrada: O arquivo de entrada contém um número não determinado de valores M
 * e N. A última linha de entrada vai conter um número nulo ou negativo.
 * 
 * Saída: Para cada dupla de valores, imprima a sequência do menor até o maior
 * e a soma deles, conforme exemplo abaixo.
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
            
            if(m > 0 && n > 0){
                if(m < n){
                    int soma = 0;
                    for (int i = m; i <= n; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + soma);
                }else{
                    int soma = 0;
                    for (int i = n; i <= m; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + soma);
                }
            }else
                return;
            
        } while (true);
        
    }
    
}
