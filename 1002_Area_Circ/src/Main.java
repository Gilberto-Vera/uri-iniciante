import java.util.Scanner;

/*
 * Desafio: 1002 Área do Circulo
 * Descrição: Este código lê um número de ponto flutuante e calcula a área de um
 * cirbulo
 */

/**
 * @author gilberto
 * @since 2018-03-09
 * @version 0.1
 */

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        double n = ler.nextDouble();
        double area = 3.14159 * (n * n);
        
        System.out.printf("A=%.4f\n", area);
    }
}