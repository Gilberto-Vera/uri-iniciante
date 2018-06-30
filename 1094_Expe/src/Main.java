
import java.util.Scanner;

/*
 * Desafio: 1094 Experiências
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
 * precisa de sua ajuda para organizar os experimentos de um laboratório o qual
 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
 * coelhos. Para obter estas informações, ela sabe exatamente o número de
 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
 * de cobaias utilizadas em cada experimento.
 * 
 * Entrada: A primeira linha de entrada contém um valor inteiro N que indica os
 * vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro
 * Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas
 * e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato
 * S:Sapo C:Coelho).
 * 
 * Saída: Apresente o total de cobaias utilizadas, o total de cada tipo de
 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos
 * após o ponto.
*/

/**
 * @author gilberto
 * @since 2018-05-18
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        double tot = 0, co = 0, ra = 0, sa = 0;    
        
        for(int i = 0; i < n; i++){
            
            int x = ler.nextInt();
            String c = ler.next();
            tot = tot + x;
            
            if("C".equals(c))
                co = co + x;
            if("R".equals(c))
                ra = ra + x;
            if("S".equals(c))
                sa = sa + x;
        }
        
        System.out.printf("Total: %.0f cobaias\n", tot);
        System.out.printf("Total de coelhos: %.0f\n", co);
        System.out.printf("Total de ratos: %.0f\n", ra);
        System.out.printf("Total de sapos: %.0f\n", sa);
        System.out.printf("Percentual de coelhos: %.2f", (co / tot) * 100);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", (ra / tot) * 100);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", (sa / tot) * 100);
        System.out.print(" %\n");
    }
}
