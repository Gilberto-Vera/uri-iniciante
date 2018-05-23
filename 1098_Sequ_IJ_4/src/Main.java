/*
 * Desafio: 1098 Sequencia IJ 4
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo
 * abaixo.
 * 
 * Entrada: Não há nenhuma entrada neste problema.
 * 
 * Saída: Imprima a sequencia conforme exemplo abaixo:
 * I=0 J=1
 * I=0 J=2
 * I=0 J=3
 * I=0.2 J=1.2
 * I=0.2 J=2.2
 * I=0.2 J=3.2
 * .....
 * I=2 J=?
 * I=2 J=?
 * I=2 J=?
*/

/**
 * @author gilberto
 * @since 2018-05-22
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;
        for(int i = 0; i <= 10; i++){
            if(i > 0)
                x = x + 2;
            for(int j = 1; j <= 3; j++){
                if(i < 5){
                    if((i % 5) == 0)
                        System.out.println("I=0" + " J=" + j);
                    else
                        System.out.println("I=0." + x + " J=" + j + "." + x);
                }
                if(i >= 5 && i < 10){
                    if((i % 5) == 0){
                        System.out.println("I=1" + " J=" + (j + 1));
                        x = 0;
                    }else
                        System.out.println("I=1." + x + " J=" + (j + 1) + "." + x);
                }
                if(i == 10)
                    System.out.println("I=2" + " J=" + (j + 2));
            }
        }
    }
}