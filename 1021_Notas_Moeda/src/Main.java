import java.io.*;
/*
 * Desafio: 1012 Notas e Moedas
 * O código lê um valor de ponto flutuante com duas casas decimais. E calcula o
 * menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e as moedas possíveis são
 * de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. Em seguida mostra a relação de notas e
 * moedas necessárias.
 */

/**
 * @author Gilberto Vera
 * @since 2018-04-05
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        
        String linha = ler.readLine();
        String[] dinheiro = new String[2];
        dinheiro = linha.split("\\.");
        
        int notas = Integer.parseInt(dinheiro[0]);
        int moedas = Integer.parseInt(dinheiro[1]);
                
        System.out.println("NOTAS:");
        System.out.println(notas / 100 + " nota(s) de R$ 100.00");
        System.out.println((notas % 100) / 50 + " nota(s) de R$ 50.00");
        System.out.println(((notas % 100) % 50) / 20 + " nota(s) de R$ 20.00");
        System.out.println((((notas % 100) % 50) % 20) / 10 + " nota(s) de R$ 10.00");
        System.out.println(((((notas % 100) % 50) % 20) % 10) / 5 + " nota(s) de R$ 5.00");
        System.out.println((((((notas % 100) % 50) % 20) % 10) % 5) / 2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(((((((notas % 100) % 50) % 20) % 10) % 5) % 2) / 1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas / 50 + " moeda(s) de R$ 0.50");
        System.out.println((moedas % 50) / 25 + " moeda(s) de R$ 0.25");
        System.out.println(((moedas % 50) % 25) / 10 + " moeda(s) de R$ 0.10");
        System.out.println((((moedas % 50) % 25) % 10) / 5 + " moeda(s) de R$ 0.05");
        System.out.println(((((moedas % 50) % 25) % 10) % 5) / 1 + " moeda(s) de R$ 0.01");
    }
}