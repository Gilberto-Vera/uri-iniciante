import java.util.Scanner;

/* Descrição:
 * lê dois valores e apresenta a soma desses valores
 *
 * @author gilberto
 * 09/03/2018
 */

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        System.out.println("X = " + (a + b));
        
    }
}