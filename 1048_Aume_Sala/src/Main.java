
import java.util.Scanner;

/*
 * Desafio: 1048 Aumento de Salário
 * Descrição: O código lê o salário do funcionário  calcula e mostra o novo
 * salário, bem como o valor de reajuste ganho e o índice reajustado, em
 * percentual de acordo com a tabela abaixo:
 *  Salário         Percentual de Reajuste
 *  0 - 400,00          15%
 *  400,01 - 800,00     12%
 *  800,01 - 1200,00    10%
 *  1200,01 - 2000,00   7%
 *  Acima de 2000,00    4%
 * 
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
        
        if(sala >= 0 && sala <= 400.00){
            System.out.printf("Novo salario: %.2f\n", ((sala * 0.15) + sala));
            System.out.printf("Reajuste ganho: %.2f\n", (sala * 0.15));
            System.out.println("Em percentual: 15 %");
        }
        if(sala > 400.00 && sala <= 800.00){
            System.out.printf("Novo salario: %.2f\n", ((sala * 0.12) + sala));
            System.out.printf("Reajuste ganho: %.2f\n", (sala * 0.12));
            System.out.println("Em percentual: 12 %");
        }
        if(sala > 800.00 && sala <= 1200.00){
            System.out.printf("Novo salario: %.2f\n", ((sala * 0.10) + sala));
            System.out.printf("Reajuste ganho: %.2f\n", (sala * 0.10));
            System.out.println("Em percentual: 10 %");
        }
        if(sala > 1200.00 && sala <= 2000.00){
            System.out.printf("Novo salario: %.2f\n", ((sala * 0.07) + sala));
            System.out.printf("Reajuste ganho: %.2f\n", (sala * 0.07));
            System.out.println("Em percentual: 7 %");
        }
        if(sala > 2000.00){
            System.out.printf("Novo salario: %.2f\n", ((sala * 0.04) + sala));
            System.out.printf("Reajuste ganho: %.2f\n", (sala * 0.04));
            System.out.println("Em percentual: 4 %");
        }
    }
}
