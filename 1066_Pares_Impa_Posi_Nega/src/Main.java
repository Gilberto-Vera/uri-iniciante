
import java.util.Scanner;

/*
 * Desafio: 1066 Pares, Ímpares, Positivos e Negativos
 * 
 * Entrada: O arquivo de entrada contém 5 valores inteiros quaisquer.
 * 
 * Saída: Imprima a seguinte mensagem:
 * "X valor(es) par(es)"
 * "X valor(es) impar(es)"
 * "X valor(es) positivo(s)"
 * "X valor(es) negativo(s)"
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int par = 0, imp = 0, pos = 0, neg = 0;
        
        for(int i = 0; i < 5; i++){
            int num = ler.nextInt();
            if((num % 2) == 0)
                par++;
            if((num % 2) != 0)
                imp++;
            if(num > 0)
                pos++;
            if(num < 0)
                neg++;
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
