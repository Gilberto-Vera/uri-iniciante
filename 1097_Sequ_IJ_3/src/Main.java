/*
 * Desafio: 1097 Sequencia IJ 3
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo
 * abaixo.
 * 
 * Entrada: Não há nenhuma entrada neste problema.
 * 
 * Saída: Imprima a sequencia conforme exemplo abaixo:
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=9
 * I=3 J=8
 * I=3 J=7
 * ...
 * I=9 J=15
 * I=9 J=14
 * I=9 J=13
*/

/**
 * @author gilberto
 * @since 2018-05-22
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i+=2){
            for(int j = 0; j < 3; j++){
                System.out.println("I=" + i + " J=" + (7 + (i - 1) - j));
            }
        }
    }
}
