
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Desafio: 1176 Fiboncci em Vetor
 * Faça um programa que leia um valor e apresente o número de Fibonacci
 * correspondente a este valor lido. Lembre que os 2 primeiros elementos da
 * série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores
 * a ele. Todos os valores de Fibonacci calculados neste problema devem caber
 * em um inteiro de 64 bits sem sinal.
 * 
 * Entrada:A primeira linha da entrada contém um inteiro T, indicando o número
 * de casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60),
 * correspondente ao N-esimo termo da série de Fibonacci.
 * 
 * Saída: Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X",
 * onde X é o N-ésimo termo da série de Fibonacci.
 */
/**
 * @author gilberto
 * @since 2018-12-12
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fibo[] = new long[61];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= 60; i++) {
            fibo[i] = fibo[i - 2] + (fibo[i - 1]);
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int numfibo = sc.nextInt();
            System.out.println("Fib(" + numfibo + ") = " + fibo[numfibo]);
        }
    }
}