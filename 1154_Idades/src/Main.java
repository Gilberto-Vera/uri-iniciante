
import java.util.Scanner;

/*
 * Desafio: 1154 Idades
 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um
 * , a idade de um indivíduo. O último dado, que não entrará nos cálculos,
 * contém o valor de idade negativa. Calcular e imprimir a idade média deste
 * grupo de indivíduos.
 * 
 * Entrada: A entrada contém um número indeterminado de inteiros. A entrada será
 * encerrada quando um valor negativo for lido.
 * 
 * Saída: A saída contém um valor correspondente à média de idade dos indivíduos.
 * A média deve ser impressa com dois dígitos após o ponto decimal.
*/

/**
 * @author gilberto
 * @since 2018-06-21
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        int cont = 0;
        
        while(true){
            int n = ler.nextInt();
            if(n >= 0){
                soma+=n;
                cont++;
            }
            else{
                System.out.printf ("%.2f\n", (float)soma / cont);
                break;
            }
        }
    }
}
