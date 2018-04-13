
import java.util.Scanner;

/* 
 * Desafio: 1040 Média 3
 * Descrição: O código lê quatro números (N1, N2, N3, N4), cada um deles com uma
 * casa decimal, correspondente às quatro notas de um aluno. Calcula a média com
 * pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostra esta
 * média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a
 * 7.0, imprime a mensagem "Aluno aprovado.". Se a média calculada for inferior
 * a 5.0, imprime a mensagem "Aluno reprovado.". Se a média calculada for um
 * valor entre 5.0 e 6.9, inclusive estas, o programa imprime a mensagem "Aluno
 * em exame.".
 * No caso do aluno estar em exame, leia um valor correspondente à nota do exame
 * obtida pelo aluno. O código imprime então a mensagem "Nota do exame: "
 * acompanhada pela nota digitada. Recalcula a média (soma a pontuação do exame
 * com a média anteriormente calculada e divide por 2). imprime a mensagem
 * "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno
 * reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos
 * (aprovado ou reprovado após ter pego exame) o código apresenta na última
 * linha uma mensagem "Media final: " seguido da média final para esse aluno.
 */

/**
 * @author gilberto
 * @since 2018-04-13
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();
        double n4 = ler.nextDouble();
        
        double n = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4)) / 10.0;
        
        System.out.printf("Media: %.1f\n", n);
        
        if(n >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(n < 5.0){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            
            double nE = ler.nextDouble();
            
            System.out.printf("Nota do exame: %.1f\n", nE);
            
            double nF = (n + nE) / 2.0;
            
            if(nF >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f\n", nF);
        }
    }
}