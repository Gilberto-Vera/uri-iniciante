
import java.util.Scanner;

/*
 * Desafio: 1045 Tipos de Triângulos
 * Descrição: O código lê 3 valores de ponto flutuante A, B e C e ordena-os em
 * ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A
 * seguir, determina o tipo de triângulo que estes três lados formam, com base
 * nos seguintes casos, sempre escrevendo uma mensagem adequada:
 *
 *   se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 *   se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 *   se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 *   se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 *   se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 *   se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO
 * ISOSCELES
 */

/**
 * @author gilberto
 * @since 2018-05-03
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float a = ler.nextFloat();
        float b = ler.nextFloat();
        float c = ler.nextFloat();
        float maior, meio, menor;
                
        if(a >= b && a >= c && b >= c){
            maior = a;
            meio = b;
            menor = c;
        }else if(c >= a && c >= b && a >= b){
            maior = c;
            meio = a;
            menor = b;
        }else if(b >= a && b >= c && c >= a){
            maior = b;
            meio = c;
            menor = a;
        }else if(a >= c && a >= b && c >= b){
            maior = a;
            meio = c;
            menor = b;
        }else if(b >= a && b >= c && a >= c){
            maior = b;
            meio = a;
            menor = c;
        }else{
            maior = c;
            meio = b;
            menor = a;
        }
        
        if(maior >= (meio + menor))
            System.out.println("NAO FORMA TRIANGULO");
        else{
            if((maior * maior) == ((meio * meio) + (menor * menor)))
                System.out.println("TRIANGULO RETANGULO");
            
            if((maior * maior) > ((meio * meio) + (menor * menor)))
                System.out.println("TRIANGULO OBTUSANGULO");
            
            if((maior * maior) < ((meio * meio) + (menor * menor)))
                System.out.println("TRIANGULO ACUTANGULO");
            
            if(a == b && b == c)
                System.out.println("TRIANGULO EQUILATERO");
            
            if(a == b && b != c || a == c && b != c || b == c && a != c)
                System.out.println("TRIANGULO ISOSCELES");
        }
    }   
}
