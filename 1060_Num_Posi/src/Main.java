
import java.util.Scanner;

/*
 * Desafio: 1060 Números Positivos
 * Descrição: O código lê 6 valores. Estes valores serão somente negativos ou
 * positivos. Em seguida, mostra a quantidade de valores positivos digitados.
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
        
        for(int i = 0; i < 6; i++){
            float num = ler.nextFloat();
            if(num > 0)
                cont++;
        }
        
        System.out.println(cont + " valores positivos");
    }
}
