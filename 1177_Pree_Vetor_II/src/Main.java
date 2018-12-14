
import java.util.Scanner;

/*
 * Desafio: 1177 Preenchimento de Vetor II
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a
 * sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
 * Imprima o vetor N.
 * 
 * Entrada: A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 * 
 * Saída: Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do
 * vetor e x é o valor armazenado naquela posição.
 */
/**
 * @author gilberto
 * @since 2018-12-13
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + (i % t));
        }
    }
}