
import java.util.Scanner;

/*
 * Desafio: 1172 Substituição em Vetor I
 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os
 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
 * 
 * Entrada: A entrada contém 10 valores inteiros, podendo ser positivos ou
 * negativos.
 * 
 * Saída: Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do
 * vetor e x é o valor armazenado naquela posição.
*/

/**
 * @author gilberto
 * @since 2018-07-27
 * @version 0.1
 */ 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if(x[i] <= 0)
                System.out.println("X[" + i +  "] = 1");
            else
                System.out.println("X[" + i + "] = " + x[i]);
        }
    }
}
