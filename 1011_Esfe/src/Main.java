import java.util.Scanner;
/*
 * Desafio: 1011 Esfera
 * Descrição: Este código mostra o volume de uma esfera a partir de um valor 
 * fornecido raio (R)com a fórmula: (4/3) * pi * R3. Considerando pi como 3.14159.
 */

/**
 * @author gilberto
 * @since 2018-04-13
 * @version 0.1
 */

public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        double raio = ler.nextInt();
        double pi = 3.14159;
        
        //BigDecimal volume = new BigDecimal(formula * pi * calcRaio); /* BigDecimal é uma classe que trabalha com números muito grades */ 
        //NumberFormat myFormatter = new DecimalFormat("###.####");    /* NumberFormat é uma classe que apresenta o número conforme a máscara */
        //System.out.println("VOLUME = "+ myFormatter.format(volume.doubleValue()));
        
        System.out.printf("VOLUME = %.3f\n", ((4.0 / 3) * pi * (raio * raio * raio))); 
    }
}