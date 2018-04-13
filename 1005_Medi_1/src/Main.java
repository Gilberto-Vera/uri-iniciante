import java.util.Scanner;
/*
 * Desafio: 1005 Média 1
 * Descrição: Este código lê dois valores e calcula e exibe média ponderada, 
 * sendo que A tem peso 3,5 e B tem peso 7,5.
 * obs: apresenta o resultado com 5 casas decimais.
*/

 /**
 * @author gilberto
 * @since 2018-03-09
 * @version 0.1
 */
public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
