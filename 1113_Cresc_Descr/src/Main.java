
import java.util.Scanner;

/*
 * Desafio: 1114 Senha Fixa
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
 * que a senha correta é o valor 2002. 
 * 
 * Entrada: A entrada é composta por vários casos de testes contendo valores
 * inteiros.
 * 
 * Saída: Para cada valor lido mostre a mensagem correspondente à descrição do
 * problema.
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
            int senha = ler.nextInt();
            
            if(senha != 2002){
                System.out.println("Senha Invalida");
            }else{
                System.out.println("Acesso Permitido");
                return;
            }
        } while (true);
    }
}
