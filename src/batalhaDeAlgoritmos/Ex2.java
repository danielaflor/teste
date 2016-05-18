/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        /*2.Faça um algoritmo que solicite x e em seguida imprima x, x++, ++x, x--, --x. Ao final exiba o resultado e diga se o mesmo é par ou ímpar.*/
        double x, y, z = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        x = entrada.nextDouble();
        //y armazena o valor de x
        y = x;

        System.out.println("O valor de x é: " + x);
        if (x % 2 == 0) {
            System.out.println("O resultado é par!");
        } else {
            System.out.println("O resultado é ímpar!");
        }

        x = y;
        z = x++;
        System.out.println("\nO valor de x++ é: " + z);
        if (z % 2 == 0) {
            System.out.println("O resultado é par!");
        } else {
            System.out.println("O resultado é ímpar!");
        }

        x = y;
        z = ++x;
        System.out.println("\nO valor de ++x é: " + z);
        if (z % 2 == 0) {
            System.out.println("O resultado é par!");
        } else {
            System.out.println("O resultado é ímpar!");
        }

        x = y;
        z = x--;
        System.out.println("\nO valor de x-- é: " + z);
        if (z % 2 == 0) {
            System.out.println("O resultado é par!");
        } else {
            System.out.println("O resultado é ímpar!");
        }

        x = y;
        z = --x;
        System.out.println("\nO valor de --x é: " + z);
        if (z % 2 == 0) {
            System.out.println("O resultado é par!");
        } else {
            System.out.println("O resultado é ímpar!");
        }
    }
}
