/*
 * Desafio: 1095 Sequencia IJ 1
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo
 * abaixo.
 * 
 * Entrada: Não há nenhuma entrada neste problema.
 * 
 * Saída: Imprima a sequencia conforme exemplo abaixo:
 * I=1 J=60
 * I=4 J=55
 * I=7 J=50
 * ...
 * I=? J=0
*/

/**
 * @author gilberto
 * @since 2018-05-22
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++){
            System.out.println("I=" + (i * 3 + 1) + " J=" + (60 - i * 5));
        }
    }
}
