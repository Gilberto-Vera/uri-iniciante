
import java.util.Scanner;

/*
 *  O código lê um valor inteiro correspondente à idade de uma pessoa em dias e
 * informa em anos, meses e dias.
 * Obs.: o cálculo considera todo ano com 365 dias e todo mês com 30 dias.
 */

/**
 * @author gilberto
 * @since 2018-04-05
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int valor = ler.nextInt();
        
        /*A expressão (valor / 365) retorna a quantidade de anos, como estamos
        trabalhando com int então ele mostra o valor inteiro e não fracionado*/
        System.out.println(valor / 365 + " ano(s)");
        /*A expressão (valor % 365) retorna o resto da divisão, ou seja, a 
        quantidade de dias após a divisão e depois divido por 30 que retornará
        a quantidade de meses*/
        System.out.println((valor % 365) / 30 + " mes(es)");
        /*A expressão ((valor % 365) % 30) retorna o resto da divisão por ano
        e depois o resto da divisão por mês que resultara na quantidade de dias*/
        System.out.println(((valor % 365) % 30) + " dia(s)");
    }
}
