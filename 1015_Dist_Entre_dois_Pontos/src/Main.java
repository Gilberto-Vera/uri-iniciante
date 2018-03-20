
import java.util.Scanner;

/*
 * O programa Le quatro valores correspondentes aos eixos x e y de dois pontos
 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcula a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 * Distancia = raiz[(x2 - x1)quad + (y2 - y1)quad]
 *
 * @author gilberto
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        double x1 = ler.nextDouble();
        double y1 = ler.nextDouble();
        double x2 = ler.nextDouble();
        double y2 = ler.nextDouble();
        
        double x = (x2 - x1) * (x2 - x1);
        double y = (y2 - y1) * (y2 - y1);
        double dist = Math.sqrt(x + y); /* calcula a raiz quadrada da expressão */
        
        System.out.printf("%.4f\n", dist);
    }
}
