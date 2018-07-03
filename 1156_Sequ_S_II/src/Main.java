/*
 * Desafio: 1156 Sequência S II
 * Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela
 * fórmula:
 * S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 * 
 * Entrada: Não há nenhuma entrada neste problema.
 * 
 * Saída: A saída contém um valor correspondente ao valor de S.
 * O valor deve ser impresso com dois dígitos após o ponto decimal.

/**
 * @author gilberto
 * @since 2018-06-30
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        float soma = 0, cont = 1;
        
        for (int i = 1; i < 40; i+=2) {
            soma += i / cont;
            cont *= 2;
        }
        System.out.printf("%.2f\n", soma);
    }
}
