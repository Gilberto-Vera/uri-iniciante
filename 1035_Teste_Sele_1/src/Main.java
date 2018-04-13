import java.util.Scanner;
/*
 * Desafio: 1035 Teste de Seleção 1
 * Descrição: O código lê 4 valores inteiros A, B, C e D. A seguir testa se B
 * for maior do que C e se D for maior do que A, e a soma de C com D for maior
 * que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for
 * par escreve  a mensagem "Valores aceitos", senão escrever "Valores nao
 * aceitos".
 */

/**
 * @author gilberto
 * @since 2018-04-10
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();
        
        if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2) == 0)
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");
    }
}
