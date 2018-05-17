
import java.util.Scanner;

/*
 * Desafio: 1070 Seis Números Ímpares
 * 
 * Entrada: A entrada será um valor inteiro positivo.
 * 
 * Saída: A saída será uma sequência de seis números ímpares.
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = ler.nextInt();
        
        for(int i = num; i < num + 12; i++){
            if((i % 2) != 0)
                System.out.println(i);      
        }
    }
}
