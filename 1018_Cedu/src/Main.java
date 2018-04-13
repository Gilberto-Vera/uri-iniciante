import java.util.Scanner;
/*
 * Desafio: 1018 Cédulas
 * Descrição: O código lê um valor inteiro e calcula o menor número de notas
 * possíveis (cédulas) no qual o valor pode ser decomposto. As notas
 * consideradas são de 100, 50, 20, 10, 5, 2 e 1 e mostra o valor lido e a
 * relação de notas necessárias.
 */

/**
 * @author gilberto
 * @since 2018-04-04
 * @version 0.1
 */
public class Main {
    
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       
       int valor = ler.nextInt();
       
       /*
       * a ideia é pegar o valor e divir pelo valor da cada nota que retornará
       * um valor inteiro e a partir do 50 pegar o resto da divisão pelo
       * anterior e dividir novamente, e assim sucessivamente
       */
       
       System.out.println(valor);
       System.out.println((valor / 100) + " nota(s) de R$ 100,00");
       System.out.println((valor % 100) / 50 + " nota(s) de R$ 50,00");
       System.out.println(((valor % 100) % 50) / 20 + " nota(s) de R$ 20,00");
       System.out.println((((valor % 100) % 50) % 20) / 10 + " nota(s) de R$ 10,00");
       System.out.println(((((valor % 100) % 50) % 20) % 10) / 5 + " nota(s) de R$ 5,00");
       System.out.println((((((valor % 100) % 50) % 20) % 10) % 5) / 2 + " nota(s) de R$ 2,00");
       System.out.println(((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1 + " nota(s) de R$ 1,00");
   } 
}