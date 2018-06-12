
import java.util.Scanner;

/*
 * Desafio: 1116 Dividindo X por Y
 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do
 * primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao
 * impossivel” para os valores em questão.
 * 
 * Entrada: A entrada contém um número inteiro N. Este N será a quantidade de
 * pares de valores inteiros (X e Y) que serão lidos em seguida.
 * 
 * Saída: Para cada caso mostre o resultado da divisão com um dígito após o
 * ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o
 * cálculo.
*/

/**
 * @author gilberto
 * @since 2018-06-12
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        float result;
        
        for (int i = 0; i < n; i++) {
            float x = ler.nextFloat();
            float y = ler.nextFloat();
            
            if (y == 0)
                System.out.println("divisao impossivel");
            else
                System.out.printf("%.1f\n", x / y);

        }
        
    }
    
}
