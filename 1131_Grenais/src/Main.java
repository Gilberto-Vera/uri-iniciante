
import java.util.Scanner;

/*
 * Desafio: 1131 Grenais
 * 
 * A Federação Gaúcha de Futebol contratou você para escrever um programa para
 * fazer uma estatística do resultado de vários GRENAIS. Escreva um programa
 * para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.
 * Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma
 * resposta. Se a resposta for 1, o algoritmo deve ser executado novamente
 * solicitando o número de gols marcados pelos times em uma nova partida, caso
 * contrário deve ser encerrado imprimindo:
 * - Quantos GRENAIS fizeram parte da estatística.
 * - O número de vitórias do Inter.
 * - O número de vitórias do Grêmio.
 * - O número de Empates.
 * - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou
 * "Nao houve vencedor", caso termine empatado).
 * 
 * Entrada: O arquivo de entrada contém 2 valores inteiros, correspondentes aos
 * gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um
 * inteiro (1 ou 2), correspondente à repetição do programa.
 * 
 * Saída: Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal
 * (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as
 * estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio"
 * deve ser impressa sem acento, conforme o exemplo abaixo.
*/

/**
 * @author gilberto
 * @since 2018-06-13
 * @version 0.1
 */ 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int gren = 0, inte = 0, grem = 0, empa = 0; 
        
        while(true){
            int golI = ler.nextInt();
            int golG = ler.nextInt();
            
            if(golI > golG)
                inte ++;
            else if(golI < golG)
                grem ++;
            else
                empa ++;
            gren ++;
            while(true){
            System.out.println("Novo grenal (1-sim 2-nao)");
            int aux = ler.nextInt();
                if (aux == 2){
                    System.out.println(gren + " grenais");
                    System.out.println("Inter:" + inte);
                    System.out.println("Gremio:" + grem);
                    System.out.println("Empates:" + empa);
                    if(golI > golG)
                        System.out.println("Inter venceu mais");
                    else if(golI < golG)
                        System.out.println("Gremio venceu mais");
                    else
                        System.out.println("Nao houve vencedor");
                    return;
                }else
                    break;
            }
            
        }
        
    }
    
}
