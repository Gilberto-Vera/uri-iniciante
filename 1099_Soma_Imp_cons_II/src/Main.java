
import java.util.Scanner;

/*
 * Desafio: 1099 Soma de Ímpares Consecutivos II
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a
 * seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve
 * apresentar a soma de todos os ímpares existentes entre X e Y.
 * 
 * Entrada: A primeira linha de entrada é um inteiro N que é a quantidade de
 * casos de teste que vem a seguir. Cada caso de teste consiste em uma linha
 * contendo dois inteiros X e Y.
 * 
 * Saída: Imprima a soma de todos valores ímpares entre X e Y.
*/

/**
 * @author gilberto
 * @since 2018-06-05
 * @version 0.1
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int casos = ler.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int soma = 0;
            int a = ler.nextInt();
            int b = ler.nextInt();
            if(a < b){
                for (int j = a + 1;j < b; j++) {
                    if((j % 2) != 0)
                        soma+=j;
                }
                System.out.println(soma);
            }else{
                for (int j = b + 1;j < a; j++) {
                    if((j % 2) != 0)
                        soma+=j;
                }
                System.out.println(soma);
            }
        }
    }
}
