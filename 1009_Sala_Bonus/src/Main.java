import java.util.Scanner;
/*
 * Desafio: 1009 Salário com Bônus
 * Descrição: O código captura o nome de um vendedor, o seu salário fixo e o 
 * total de vendas efetuadas por ele no mês. Adiciona 15% de comissão sobre suas
 * vendas efetuadas e exibe o total a receber no final do mês
 * com duas casas decimais.
 */

/**
 * @author gilberto
 * @since 2018-03-15
 * @version 0.1
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        String nome = ler.next();
        double sala_fixo = ler.nextDouble();
        double tot_vendas = ler.nextDouble();
        
        System.out.printf("TOTAL = R$ %.2f\n", (sala_fixo + (tot_vendas * 0.15)));
    }
}
