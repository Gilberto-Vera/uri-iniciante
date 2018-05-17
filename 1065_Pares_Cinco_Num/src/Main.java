
import java.util.Scanner;

/*
 * Desafio: 1065 Pares Entre Cinco Números
 * Entrada: O arquivo de entrada contém 5 valores inteiros quaisquer.
 * 
 * Saída: Imprime a mensagem "x valores pares", onde x indica a quantidade de
 * valores pares lidos.
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int cont = 0;
        
        for(int i = 0; i < 5; i++){
            int num = ler.nextInt();
            if((num % 2) == 0)
                cont++;
        }
        
        System.out.println(cont + " valores pares");
    }
}
