
import java.util.Scanner;

/*
 * Desafio: 1047 Tempo de Jogo com Minutos
 * Descrição: O código lê a hora inicial, minuto inicial, hora final e minuto
 * final de um jogo. E calcula a duração do jogo.
 * 
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 * 
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
        int mIni = ler.nextInt();
        int hFin = ler.nextInt();
        int mFin = ler.nextInt();
        
        if(hIni > hFin){
            if(mIni > mFin)
                System.out.println("O JOGO DUROU " + (((24-hIni) + hFin) - 1) + " HORA(S) E " + ((60 - mIni) + mFin) + " MINUTO(S)");
            else if(mIni < mFin)
                System.out.println("O JOGO DUROU " + ((24-hIni) + hFin) + " HORA(S) E " + (mFin - mIni) + " MINUTO(S)");
        }else if(hIni < hFin){
            if(mIni > mFin)
                System.out.println("O JOGO DUROU " + ((hFin - hIni) - 1) + " HORA(S) E " + ((60 - mIni) + mFin) + " MINUTO(S)");
            else if(mIni <= mFin)
                System.out.println("O JOGO DUROU " + (hFin - hIni) + " HORA(S) E " + (mFin - mIni) + " MINUTO(S)");
        }else{
            if(mIni > mFin)
                System.out.println("O JOGO DUROU 23 HORA(S) E " + ((60 - mIni) + mFin) + " MINUTO(S)");
            else if(mIni < mFin)
                System.out.println("O JOGO DUROU 0 HORA(S) E " + (mFin - mIni) + " MINUTO(S)");
            else
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
    }
}
