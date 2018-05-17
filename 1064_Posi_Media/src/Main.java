
import java.util.Scanner;

/*
 * Desafio: 1064 Positivos e Média
 * Entrada: A entrada contém 6 números que podem ser valores inteiros ou de
 * ponto flutuante. Pelo menos um destes números será positivo.
 * 
 * Saída: O primeiro valor de saída é a quantidade de valores positivos. A
 * próxima linha deve mostrar a média dos valores positivos digitados.
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
        double soma = 0;
        
        for(int i = 0; i < 6; i++){
            Double num = ler.nextDouble();
            if(num > 0){
                cont++;
                soma = soma + num;
            }
        }
        
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", (soma / cont));
    }
}
