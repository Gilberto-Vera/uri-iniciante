
import java.util.Scanner;

/*
 * Desafio: 1079 Média Ponderada
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
 * o terceiro valor tem peso 5.
 * 
 * Entrada: O arquivo de entrada contém um valor inteiro N na primeira linha.
 * Cada N linha a seguir contém um caso de teste com três valores com uma casa
 * decimal cada valor.
 * 
 * Saída: Para cada caso de teste, imprima a média ponderada dos 3 valores.
*/

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        
        for(int i = 0; i < n; i++){
            
            double x1 = ler.nextDouble();
            double x2 = ler.nextDouble();
            double x3 = ler.nextDouble();
            
            System.out.printf("%.1f\n", (((x1 * 2) + (x2 * 3) + (x3 * 5)) / 10));
        }
    }
}