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
        
        double n = ler.nextDouble();
        double area = 3.14159 * (n * n);
        
        System.out.printf("A=%.4f\n", area);
    }
}