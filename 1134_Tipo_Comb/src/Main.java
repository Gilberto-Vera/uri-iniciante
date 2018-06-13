
import java.util.Scanner;

/*
 * Desafio: 1134 Tipo de Combustível
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
 * será encerrado quando o código informado for o número 4.
 * 
 * Entrada: A entrada contém apenas valores inteiros e positivos.
 * 
 * Saída: Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de
 * clientes que abasteceram cada tipo de combustível, conforme exemplo.
*/

/**
 * @author gilberto
 * @since 2018-06-13
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int alco = 0, gaso = 0, dies = 0;
        
        while(true){
            int opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    alco ++;
                    break;
                case 2:
                    gaso ++;
                    break;
                case 3:
                    dies ++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + alco);
                    System.out.println("Gasolina: " + gaso);
                    System.out.println("Diesel: " + dies);
                    return;
                default:
                    break;
            }
        }
    }
}
