
import java.util.Scanner;

/*
 * Desafio: 1045 Tipos de Triângulos
 * Descrição: O código lê a hora inicial e a hora final de um jogo. A seguir
 * calcula a duração do jogo, sabendo que o mesmo pode começar em um dia e
 * terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

/**
 * @author gilberto
 * @since 2018-05-15
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int hIni = ler.nextInt();
        int hFin = ler.nextInt();
        
        if(hIni == hFin){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(hIni > hFin){
            hIni = 24 - hIni;
            System.out.println("O JOGO DUROU " + (hIni + hFin) + " HORA(S)");
        }else
            System.out.println("O JOGO DUROU " + (hFin - hIni) + " HORA(S)");
    }
}
