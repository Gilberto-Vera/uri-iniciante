
import java.util.Scanner;

/*
 * Desafio: 1042 Sort Simples
 * Descrição: O código lê 3 valores inteiros e ordene-os em ordem crescente. No
 * final, mostra os valores em ordem crescente, uma linha em branco e em
 * seguida, os valores na sequência como foram lidos.
 */

/**
 * @author gilberto
 * @since 2018-04-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        
        if(a < b && a < c && b < c){
            System.out.println(a + "\n" + b + "\n" + c + "\n");
            System.out.println(a + "\n" + b + "\n" + c);        
        }else if(a > b && a < c && b < c){
            System.out.println(b + "\n" + a + "\n" + c + "\n");
            System.out.println(a + "\n" + b + "\n" + c);
        }else if(a > b && a > c && b < c){
            System.out.println(b + "\n" + c + "\n" + a + "\n");
            System.out.println(a + "\n" + b + "\n" + c);
        }else if(a > b && a > c && b > c){
            System.out.println(c + "\n" + b + "\n" + a + "\n");
            System.out.println(a + "\n" + b + "\n" + c);
        }else if(a < b && a > c && b > c){
            System.out.println(c + "\n" + a + "\n" + b + "\n");
            System.out.println(a + "\n" + b + "\n" + c);
        }else{
            System.out.println(a + "\n" + c + "\n" + b + "\n");
            System.out.println(a + "\n" + b + "\n" + c);        
        }
    }
}
