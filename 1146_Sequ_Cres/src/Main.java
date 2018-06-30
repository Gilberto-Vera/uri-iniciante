
import java.util.Scanner;

/*
 * Desafio: 1146 Sequências Crescentes
 * Este programa deve ler uma variável inteira X inúmeras vezes (deve parar
 * quando o valor no arquivo de entrada for igual a zero). Para cada valor lido
 * imprima a sequência de 1 até X, com um espaço entre cada número e seu
 * sucessor.
 * Obs: cuide para não deixar espaço em branco após o último valor apresentado
 * na linha ou você receberá Presentation Error.
 * 
 * Entrada: O arquivo de entrada contém vários números inteiros. O último número
 * no arquivo de entrada é 0.
 * 
 * Saída: Para cada número N do arquivo de entrada deve ser impressa uma linha
 * de 1 até N, conforme o exemplo abaixo. Não deve haver espaço em branco após o
 * último valor da linha.
*/

/**
 * @author gilberto
 * @since 2018-06-14
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        while(true){
            int n = ler.nextInt();
            
            if(n != 0){
                for (int i = 1; i <= n; i++) {
                    if(i < n)
                        System.out.print(i + " ");
                    else
                        System.out.println(i);
                }
            }else
                return;
        }
    }
}
