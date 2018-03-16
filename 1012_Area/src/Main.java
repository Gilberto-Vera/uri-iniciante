
import java.util.Scanner;

/*
 * Este código lê trẽs valores com ponto flutuante de dupla precisão: A, B e C. 
 * Calcula e mostra:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B. 
 *
 * @author gilberto
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float a = ler.nextFloat();
        float b = ler.nextFloat();
        float c = ler.nextFloat();
        
        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * (c * c));
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);
    }
}
