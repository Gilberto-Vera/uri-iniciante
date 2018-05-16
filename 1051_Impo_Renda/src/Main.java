
import java.util.Scanner;

/*
 * Desafio: 1051 Imposto de Renda
 * Descrição: O código lê um valor com duas casas decimais, equivalente ao
 * salário de uma pessoa de Lisarb. Em seguida, calcula e mostra o valor que
 * esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 *  Renda                   Imposto de Renda
 *  de 0,00 a 2000,00           Isento
 *  de 2000,01 até 3000,00      8%
 *  de 3000,01 até 4500,00      18%
 *  acima 4500,00               28%
 * 
 * Lembrando que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
 */

/**
 * @author gilberto
 * @since 2018-05-16
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double sala = ler.nextDouble();
        
        if(sala >= 0 && sala <= 2000)
            System.out.println("Isento");
        if(sala > 2000 && sala <= 3000)
                System.out.printf("R$ %.2f\n", (sala - 2000) * 0.08);
        if(sala > 3000 && sala <= 4500)
                System.out.printf("R$ %.2f\n", ((sala - 3000) * 0.18) + (1000 * 0.08));
        if(sala > 4500)
            System.out.printf("R$ %.2f\n", ((sala - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08));
    }
}
