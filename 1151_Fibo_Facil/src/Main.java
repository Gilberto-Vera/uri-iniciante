
import java.util.Scanner;

/*
 * Desafio: 1151 Fibonacci Fácil
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
 * de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
 * soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
 * mostre os N primeiros números dessa série.
 * 
 * Entrada: O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 * 
 * Saída: Os valores devem ser mostrados na mesma linha, separados por um espaço
 * em branco. Não deve haver espaço após o último valor.

/**
 * @author gilberto
 * @since 2018-06-21
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt() - 1;
        int n1 = 0, n2 = 1;
        int atual = 0;
        
        for (int i = 0; i < n; i++) {
            
            if(i == 0)
                System.out.print("0 1 ");
            else if(i == n - 1)
                System.out.println(atual);
            else{
                System.out.print(atual + " ");
                
            }
            atual = n1 + n2;
            n1 = n2;
            n2 = atual;
            
        }
        
    }
    
}
