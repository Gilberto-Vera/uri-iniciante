import java.util.Scanner;
/*
 * Desafio: 1015 Distância Entre Dois Pontos
 * Descrição: O programa Le quatro valores correspondentes aos eixos x e y de 
 * dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcula a distância
 * entre eles, mostrando 4 casas decimais após a vírgula.
 */

/**
 * @author gilberto
 * @since 2018-04-13
 * @version 0.1
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
