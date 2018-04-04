
import java.util.Scanner;
/*
 * Este código lê 4 valores (a, b, c e d) e apresenta a diferença do produto de
 * a e b pelo produgo de c e d.
 * obs: (a * b - c * d).
 *

 /**
 * @author gilberto
 * @since 2018-04-04
 * @version 1.0
 */
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();
        
        System.out.println("DIFERENCA = " + ((a * b) - (c * d)));
    }
}