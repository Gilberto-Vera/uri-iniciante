
import java.util.Scanner;

/*
 * Desafio: 1157 Divisores I
 * Ler um número inteiro N e calcular todos os seus divisores.
 * 
 * Entrada: O arquivo de entrada contém um valor inteiro.
 * 
 * Saída: Escreva todos os divisores positivos de N, um valor por linha.
*/

/**
 * @author gilberto
 * @since 2018-07-04
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        
        for (int i=1; i<=n; i++) {
            if((n%i) == 0)
                System.out.println(i);
        }
    }
}
