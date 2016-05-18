/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        /*1. Faça um algoritmo que solicite x e y e em seguida calcule o resultado de cada uma das expressões a seguir, exiba o resultado e 
        classifique como positivo,nulo ou negativo.
        a) x + y /2
        b) (x + y) /2
        c) (x + y /2)
        d) (x) + (y /2)*/

        double x, y, z;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        x = entrada.nextDouble();
        System.out.println("Informe o valor de y: ");
        y = entrada.nextDouble();

        z = x + y / 2;
        System.out.println("O resultado de x+y/2 é: " + z);
        if (z > 0) {
            System.out.println("O resultado é positivo!");
        } else {
            if (z < 0) {
                System.out.println("O resultado é negativo!");
            } else {
                System.out.println("O resultado é nulo!");
            }
        }

        z = (x + y) / 2;
        System.out.println("\nO resultado de (x+y)/2 é: " + z);
        if (z > 0) {
            System.out.println("O resultado é positivo!");
        } else {
            if (z < 0) {
                System.out.println("O resultado é negativo!");
            } else {
                System.out.println("O resultado é nulo!");
            }
        }

        z = (x + y / 2);
        System.out.println("\nO resultado de (x+y/2) é: " + z);
        if (z > 0) {
            System.out.println("O resultado é positivo!");
        } else {
            if (z < 0) {
                System.out.println("O resultado é negativo!");
            } else {
                System.out.println("O resultado é nulo!");
            }
        }

        z = (x) + (y / 2);
        System.out.println("\nO resultado de (x)+(y/2) é: " + z);
        if (z > 0) {
            System.out.println("O resultado é positivo!");
        } else {
            if (z < 0) {
                System.out.println("O resultado é negativo!");
            } else {
                System.out.println("O resultado é nulo!");
            }
        }

    }

}
