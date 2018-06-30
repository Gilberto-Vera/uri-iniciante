
import java.util.Scanner;

/*
 * Desafio: 1072 Intervalo 2
 * 
 * Entrada: A primeira linha da entrada contém um valor inteiro N (N < 10000),
 * que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 * 
 * Saída: Para cada caso, imprima quantos números estão dentro (in) e quantos
 * valores estão fora (out) do intervalo [10,20].
 */

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = ler.nextInt();
        int contIn = 0, contOut = 0;
                
        for(int i = 0; i < num; i++){
            int valor = ler.nextInt();
            if(valor >= 10 && valor <= 20)
                contIn++;
            else
                contOut++;
        }
        
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
    }
}
