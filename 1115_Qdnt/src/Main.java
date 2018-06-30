
import java.util.Scanner;


/*
 * Desafio: 1115 Quadrante
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 * 
 * Entrada: A entrada contém vários casos de teste. Cada caso de teste contém 2
 * valores inteiros.
 * 
 * Saída: Para cada caso de teste mostre em qual quadrante do sistema cartesiano
 * se encontra a coordenada lida, conforme o exemplo.
*/

/**
 * @author gilberto
 * @since 2018-06-12
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        do{
            int x = ler.nextInt();
            int y = ler.nextInt();
            
            if(x != 0 && y != 0){
                if(x > 0 && y > 0)
                    System.out.println("primeiro");
                if(x < 0 && y > 0)
                    System.out.println("segundo");
                if(x < 0 && y < 0)
                    System.out.println("terceiro");
                if(x > 0 && y < 0)
                    System.out.println("quarto");
            }else
                return;
            
        } while (true);
        
    }
}
