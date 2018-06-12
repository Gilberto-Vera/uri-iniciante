
import java.util.Scanner;

/*
 * Desafio: 1117 Validação de Nota
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
 * ser validada separadamente.
 * 
 * Entrada: A entrada contém vários valores reais, positivos ou negativos. O
 * programa deve ser encerrado quando forem lidas duas notas válidas.
 * 
 * Saída: Se uma nota inválida  for lida, deve ser impressa a mensagem "nota 
 * invalida".
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem
 * "media = " seguido do valor do cálculo. O valor deve ser apresentado com
 * duas casas após o ponto decimal.
*/

/**
 * @author gilberto
 * @since 2018-06-12
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int aux = 0;
        float soma = 0;
        
        while(aux < 2){
        
            float n = ler.nextFloat();
            if(n < 0 || n > 10)
                System.out.println("nota invalida");
            else{
                soma += n;
                aux++;
            }
            
        }
        
        System.out.printf("media = %.2f\n", soma / 2);
    }
    
}
