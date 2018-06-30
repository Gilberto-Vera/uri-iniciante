/*
 * Desafio: 1059 Números Pares
 * Descrição: O código faz um programa que mostra os números pares entre 1 e
 * 100, inclusive.
 */

/**
 * @author gilberto
 * @since 2018-05-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            if((i%2) == 0)
                System.out.println(i);
        }
    }
}
