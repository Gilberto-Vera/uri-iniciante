import java.util.Scanner;
/*
 * Desafio: 1017 Gasto de Combústives
 * Descrição: O código recebe o tempo de viagem, a velocidade média, calcula a
 * distância percorrida e verifica quantos litros de combustível será gasto num
 * carro que faz 12 km/l.
 * Dado pela relação dist = Veloc * tempo
 */

/**
 * @author gilberto
 * @since 2018-03-20
 * @version 0.1
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