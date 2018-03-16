import java.util.Scanner;
/*
 * Este código lê dois inteiros e apresenta a produto deles
 *
 * @author gilberto
 * 09/03/2018
 */
public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        int prod = a * b;
        
        System.out.println("PROD = " + prod);
    }
    
}
