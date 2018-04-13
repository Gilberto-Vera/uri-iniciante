import java.util.Scanner;
/*
 * Desafio: 1016 Distância
 * Descrição: O código lê a distância (em Km) e calcula quanto tempo leva (em
 * minutos) para o carro Y tomar essa distância do outro carro.
 * 1 - Dois carros (x e y) partem para numa mesma direção.
 * 2 - x sai com uma velocidade constante de 60 km/h.
 * 3 - y sai com uma velocidade constante de 90 km/h.
 * 4 - Velocidade relativa = Vy - Vx = 90 - 60 = 30 km/h.
 * 5 - Tempo = (distância / velocidade relativa) * 60 = (distância / 30) * 60 =
 * distância * 2.
 * 6 - Converter o tempo de hora para minuto multiplicando o resultado por 60.
 */

/**
 * @author gilberto
 * @since 2018-03-20
 * @version 0.1
 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        int dist = ler.nextInt();
        
        System.out.println((dist * 2) + " minutos");
    }
}