
import java.util.Scanner;

/*
 * Desafio: 1043 Triângulo
 * Descrição: O código lẽ 3 valores reais (A, B e C) e verifique se eles formam
 * ou não um triângulo. Em caso positivo, calcula o perímetro do triângulo e
 * apresenta a mensagem:
 * Perimetro = XX.X
 * Em caso negativo, calcula a área do trapézio que tem A e B como base e C como
 * altura, mostrando a mensagem:
 * Area = XX.X
 */

/**
 * @author gilberto
 * @since 2018-04-24
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float a = ler.nextFloat();
        float b = ler.nextFloat();
        float c = ler.nextFloat();
        
        if(Math.abs(b - c) < a && a < b + c || Math.abs(a - c) < b && b < a + c || Math.abs(a - b) < c && c < a + b){
            System.out.printf("Perimetro = %.1f\n", a + b + c);
        }else{
            System.out.printf("Area = %.1f\n", ((a + b) * c) / 2);
        }
    }
}
