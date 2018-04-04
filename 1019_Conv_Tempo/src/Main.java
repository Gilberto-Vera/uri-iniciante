
import java.util.Scanner;

/*
 * O código lê um valor inteiro, que é o tempo de duração em segundos de um
 * determinado evento em uma fábrica, e informa expresso no formato
 * horas:minutos:segundos.
 */

/**
 * @author gilberto
 * @since 2018-04-04
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int valor = ler.nextInt();
        int hora, min, seg;
        
        hora = valor / 3600;
        min = (valor % 3600) / 60;
        seg = valor % 60;
        
        System.out.println(hora + ":" + min + ":" + seg);
    }
}
