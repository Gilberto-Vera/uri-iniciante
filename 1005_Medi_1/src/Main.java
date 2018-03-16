import java.util.Scanner;
/*
 * Este código lê dois valores e calcula e exibe média ponderada, sendo que 
 * A tem peso 3,5 e B tem peso 7,5.
 * obs: apresenta o resultado com 5 casas decimais.
 * 
 * @author gilberto
 * 09/03/2018
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
