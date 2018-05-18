
import java.util.Scanner;

/*
 * Desafio: 1074 Par ou Ímpar
 * 
 * Entrada: A primeira linha da entrada contém um valor inteiro N(N < 10000)
 * que indica o número de casos de teste. Cada caso de teste a seguir é um valor
 * inteiro X (-10^7 < X <10^7).
 * 
 * Saída: Para cada caso, imprima uma mensagem correspondente, de acordo com o
 * exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver
 * um espaço entre duas palavras impressas na mesma linha.
 * "EVEN NEGATIVE"
 * "ODD NEGATIVE"
 * "NULL"
 * "ODD POSITIVE"
 * "EVEN POSITIVE"
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
        
        for(int i = 0; i < num; i++){
            
            int x = ler.nextInt();
            
            if(x == 0)
                System.out.println("NULL");
            else if((x % 2) == 0){
                if(x < 0)
                    System.out.println("EVEN NEGATIVE");
                else
                    System.out.println("EVEN POSITIVE");
            }else{
                if(x < 0)
                    System.out.println("ODD NEGATIVE");
                else
                    System.out.println("ODD POSITIVE");
            }
        }
    }
}
