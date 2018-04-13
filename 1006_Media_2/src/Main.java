import java.util.Scanner;
/*
 * Desafio: 1006 Média 2
 * Descrição: Este código lê 3 valores e calcula a média ponderada, sendo que a 
 * nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
 * obs: Considerando que cada nota pode ir de 0 até 10.0, sempre com uma casa 
 * decimal.
*/

 /**
 * @author gilberto
 * @since 2018-03-13
 * @version 0.1
 */
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
                
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);
        
    }
}