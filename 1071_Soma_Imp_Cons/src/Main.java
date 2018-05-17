
import java.util.Scanner;

/*
 * Desafio: 1071 Soma de Impares Consecutivos I
 * 
 * Entrada: O arquivo de entrada contém dois valores inteiros.
 * 
 * Saída: O programa deve imprimir um valor inteiro. Este valor é a soma dos
 * valores ímpares que estão entre os valores fornecidos na entrada que deverá
 * caber em um inteiro.
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int soma = 0;
        
        for(int i = num2 + 1; i < num1; i++){
            if((i % 2) != 0)
                soma = soma + i;
        }
        System.out.println(soma);      
    }
}
