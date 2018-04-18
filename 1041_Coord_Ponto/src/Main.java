
import java.util.Scanner;

/*
 * Desafio: 1041 Coordenadas de um Ponto
 * Descrição: O código lê 2 valores com uma casa decimal (x e y), que devem
 * representar as coordenadas de um ponto em um plano. A seguir, determina qual
 * o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
 * cartesianos ou na origem (x = y = 0).
 * 
 * Se o ponto estiver na origem, escreve a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreve “Eixo X” ou “Eixo Y”, conforme
 * for a situação.
 */

/**
 * @author gilberto
 * @since 2018-04-17
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float x = ler.nextFloat();
        float y = ler.nextFloat();
        
        if(x == 0 && y == 0)
            System.out.println("Origem");
        
        else if(x == 0 && y != 0)
            System.out.println("Eixo Y");
        
        else if(x != 0 && y == 0)
            System.out.println("Eixo X");
        
        else if(x > 0 && y > 0)
            System.out.println("Q1");
        
        else if(x < 0 && y > 0)
            System.out.println("Q2");
        
        else if(x < 0 && y < 0)
            System.out.println("Q3");
        
        else if(x > 0 && y < 0)
            System.out.println("Q4");
        
    }
}
