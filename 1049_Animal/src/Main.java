
import java.util.Scanner;

/*
 * Desafio: 1049 Animal
 * Descrição: O código lê 3 palavras que definem o tipo de animal possível
 * segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclui
 * qual dos animais seguintes foi escolhido, através das três palavras fornecidas. 
 * 
 *                     __carnivoro__aguia
 *              __ave_/ 
 *             /      \__onivoro__pomba
 * vertebrado_/
 *            \             __onivoro__homem
 *             \__mamífero_/
 *                         \__herbivoro__vaca
 * 
 *                          __hematofago__pulga
 *                __inseto_/
 *               /         \__herbivoro__lagarta
 * invertebrado_/
 *              \             __hematofago__sanguessuga
 *               \__anelideo_/
 *                           \__onivoro__minhoca
 */

/**
 * @author gilberto
 * @since 2018-05-16
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String tipo1 = ler.nextLine();
        String tipo2 = ler.nextLine();
        String tipo3 = ler.nextLine();
        
        if(tipo1.equals("vertebrado")){
            if(tipo2.equals("ave")){
                if(tipo3.equals("carnivoro"))
                    System.out.println("aguia");
                if(tipo3.equals("onivoro"))
                    System.out.println("pomba");
            }
            if(tipo2.equals("mamifero")){
                if(tipo3.equals("onivoro"))
                    System.out.println("homem");
                if(tipo3.equals("herbivoro"))
                    System.out.println("vaca");
            }
        }
        if(tipo1.equals("invertebrado")){
            if(tipo2.equals("inseto")){
                if(tipo3.equals("hematofago"))
                    System.out.println("pulga");
                if(tipo3.equals("herbivoro"))
                    System.out.println("lagarta");
            }
            if(tipo2.equals("anelideo")){
                if(tipo3.equals("hematofago"))
                    System.out.println("sanguessuga");
                if(tipo3.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
    }
}
