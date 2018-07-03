/*
 * Desafio: 1155 Sequência S
 * Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela
 * fórmula:
 * S = 1 + 1/2 + 1/3 + … + 1/100
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
        
        float soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }
        
        System.out.printf("%.2f\n", soma);
        
    }
    
}
