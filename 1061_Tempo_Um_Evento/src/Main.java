
import java.util.Scanner;

/*
 * Desafio: 1060 Números Positivos
 * Entrada: Na primeira linha a descrição “Dia”, seguido de um espaço e o dia
 * do mês no qual o evento vai começar. Na linha seguinte, será informado o
 * momento no qual o evento vai iniciar, no formato hh : mm : ss.
 * Na terceira e quarta linha de entrada haverá outra informação no mesmo
 * formato das duas primeiras linhas, indicando o término do evento.
 * 
 * Saída: Na saída, será apresentada a duração do evento, no seguinte formato:
 * 
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        boolean h = false, m = false, s = false;
        int dia = 0, hor = 0, min = 0, seg = 0;
        
        String dI = ler.next();
        int dIni = ler.nextInt();
        
        int hIni = ler.nextInt();
        String dp1 = ler.next();
        int mIni = ler.nextInt();
        String dp2 = ler.next();
        int sIni = ler.nextInt();
        
        String dF = ler.next();
        int dFin = ler.nextInt();
        
        int hFin = ler.nextInt();
        String dp3 = ler.next();
        int mFin = ler.nextInt();
        String dp4 = ler.next();
        int sFin = ler.nextInt();

        if(hIni > hFin)
            h = true;
        
        if(mIni > mFin)
            m = true;
        
        if(sIni > sFin)
            s = true;
        
        while(dIni != dFin){
            dia++;
            dIni++;
        }
        
        while(hIni != hFin){
            hor++;
            hIni++;
            if(hIni == 25)
                hIni = 1;
        }

        while(mIni != mFin){
            min++;
            mIni++;
            if(mIni == 61)
                mIni = 1;
        }

        while(sIni != sFin){
            seg++;
            sIni++;
            if(sIni == 61)
                sIni = 1;
        }
        
        if(h == true)
            dia--;
        
        if(m == true)
            hor--;
        
        if(s == true)
            min--;
        
        System.out.println(dia + " dia(s)");
        System.out.println(hor + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");
    }
}
