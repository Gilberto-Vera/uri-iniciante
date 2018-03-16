import java.util.Scanner;
/*
 * Este código lê trẽs valores: Número do funcionário, número de horas 
 * trabalhadas e valor da hora trabalhada e em apresenta o valor do salário.
 * obs: O salario é apresentado com duas casas decimais.
 * 
 * @author gilberto
 * 13/03/2018
 */
public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        int num_Func = ler.nextInt();
        int horas = ler.nextInt();
        double sala = ler.nextDouble();
        
        System.out.println("NUMBER = " + num_Func);
        System.out.printf("SALARY = U$ %.2f\n", (horas * sala));
    }
}