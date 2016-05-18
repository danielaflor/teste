/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        /*6.Calcule as raízes reais de uma equação de 2ºgrau, verifique e informe ao usuário se existem raízes reais válidas 
    ou se existe uma única raiz real ou ainda se existem duas raízes reais.*/
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, y1, y2;
        System.out.println("ax² + bx + c = 0");
        System.out.println("Informe o valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Informe o valor de c: ");
        c = entrada.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        } else {
            y1 = (-b + Math.sqrt(delta)) / (2 * a);
            y2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("y1= "+y1);
            System.out.println("y2= "+y2);

            if (y1 == y2) {
                System.out.println("Esta equação possui raízes reais iguais");
            } else {
                System.out.println("Esta equação possui duas raízes reais");
            }
        }

    }
}
