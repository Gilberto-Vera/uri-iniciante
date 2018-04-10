
import java.util.Scanner;

/*
 * 1036 Fórmula de Bhakara
 * O código lê 3 valores de ponto flutuante e efetue o cálculo das raízes da 
 * equação de Bhaskara. Se não for possível calcular as raízes, mostra a
 * mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 
 * ou raiz de numero negativo.
 */

/**
 * @author gilberto
 * @since 2018-04-10
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        
        if(a == 0 || (b * b) - 4 * a * c < 0){
            System.out.println("Impossivel calcular");
        }else{
            double sqrt = Math.sqrt((b * b) - 4 * a * c);
            double r1 = (- b + sqrt) / (2 * a);
            double r2 = (- b - sqrt) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
