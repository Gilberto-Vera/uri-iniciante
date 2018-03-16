import java.util.Scanner;

/*
 * Este código resolve o problema 1001 do módulo iniciante
 */

/**
 * @author gilberto
 * 09/03/2018
 */

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
    }
    
}
