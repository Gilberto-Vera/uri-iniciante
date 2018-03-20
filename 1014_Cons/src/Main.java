
import java.util.Scanner;

/*
 * Este código calcula o consumo médio de um automóvel sendo fornecidos a partir
 * da distância total percorrida (em Km) e o total de combustível gasto (em 
 * litros).
 * E apresenta o consumo em km/l com 3 casas decimais.
 *
 * @author gilberto
 * 20/03/2018
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        int km = ler.nextInt();
        double tot_comb = ler.nextDouble();
        double km_l = km / tot_comb;
        
        System.out.printf("%.3f km/l\n", km_l);
    }
}