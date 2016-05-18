/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a,b,r,area;
        //a é a altura do retângulo, b é a base e r é o raio do círculo.
        
        System.out.println("Informe o valor da altura (A): ");
        a = entrada.nextDouble();
        System.out.println("Informe o valor da base (B): ");
        b = entrada.nextDouble();
        System.out.println("Informe o valor do raio (r): ");
        r = entrada.nextDouble();
        
        area = ((b*a)/2) - (Math.PI* Math.pow(r, 2));
        //a área é dada pelo cálculo da metade do retângulo subtraída pela área do círculo
        
        if (area < 10) {
            System.out.println("A área é "+area+" e pertence ao conjunto A");
        }
        else
            if (area >= 11 && area <= 30) {
                System.out.println("A área é "+area+" e pertence ao conjunto B");
            }
        else
                if (area >= 31 && area <= 50) {
                    System.out.println("A área é "+area+" e pertence ao conjunto C");
                }
                else{
                    System.out.println("A área é "+area+" e pertence ao conjunto D");
                }
    }
}
