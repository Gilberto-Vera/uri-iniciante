
import java.util.Scanner;

/* 
 * Desafio: 1038 Lanches
 * Descrição: Com base na tabela abaixo, o cógigo lê um código de um item e a
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * CODIGO   ESPECIFICAÇÃO       PREÇO
 * 1        cachorro quente     R$ 4,00
 * 2        X-Salada            R$ 4,50
 * 3        X-Bacon             R$ 5,00
 * 4        Torrada Simples     R$ 2,00
 * 5        Refrigerante        R$ 1,50
 */

/**
 * @author gilberto
 * @since 2018-04-13
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int cod = ler.nextInt();
        int quant = ler.nextInt();
        
        switch (cod) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", (float)quant * 4);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", (float)quant * 4.5);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", (float)quant * 5);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", (float)quant * 2);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", (float)quant * 1.5);
                break;
            default:
                break;
        }
    }
}
