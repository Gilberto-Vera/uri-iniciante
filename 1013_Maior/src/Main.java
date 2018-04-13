import java.util.Scanner;
/*
 * Desafio: 1013 O Maior
 * Descrição: Este código lê três valores e apresente o maior dos três.
 */

/**
 * @author gilberto
 * @since 2018-03-14
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        
        int maior_ab = (a + b + Math.abs(a -b)) / 2;
        int maior_abc = (maior_ab + c + Math.abs(maior_ab - c)) / 2;
        
        System.out.println(maior_abc + " eh o maior");
    }
}
