import java.util.Scanner;
/*
 * Desafio: 1010 Cálculo Simples
 * Descrição: Este código le o código de uma peça 1, o número de peças 1, o 
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e 
 * o valor unitário de cada peça 2 e mostra o valor a ser pago.
 */

/**
 * @author gilberto
 * @since 2018-03-16
 * @version 0.1
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        int peca1 = ler.nextInt();
        int qtd_peca1 = ler.nextInt();
        double preco_peca1 = ler.nextDouble();
        int peca2 = ler.nextInt();
        int qtd_peca2 = ler.nextInt();
        double preco_peca2 = ler.nextDouble();
        
        double vlr_tot_peca1 = qtd_peca1 * preco_peca1;
        double vlr_tot_peca2 = qtd_peca2 * preco_peca2;
        double vlr_total = vlr_tot_peca1 + vlr_tot_peca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlr_total);
        
    }
}
