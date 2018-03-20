
import java.util.Scanner;

/*
 * O código recebe o tempo de viagem, a velocidade média, calcula a distância 
 * percorrida e verifica quantos litros de combustível será gasto num carro que
 * faz 12 km/l.
 * Dado pela relação dist = Veloc * tempo
 *
 * @author gilberto
 * 20/03/2018
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        int velo = ler.nextInt();
        int tempo = ler.nextInt();
        
        double dist = velo * tempo;
        
        System.out.printf("%.3f\n", dist / 12);
    }
}