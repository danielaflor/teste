/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Ex3 {
    public static void main(String[] args){
    /*
    3.Faça um algoritmo que calcule e imprima o valor de H a partir de cada expressão abaixo:
    a. H = a/ (2+b)
    b. H = a^2/(2+b)
    c. H = 1+(1/x)+(2/x)+(3/x)+(4/x)
    d. H = h = c/((a+b)-2*b+c)
    */
    
    double a=2,b=3,c=4,x=5,h;
    
    h = a/ (2+b);
    System.out.println("a. O valor de H é: "+h);
    
    h = Math.pow(a, 2)/(2+b);
    System.out.println("\nb. O valor de H é: "+h);
    
    h = 1+(1/x)+(2/x)+(3/x)+(4/x);
    System.out.println("\nc. O valor de H é: "+h);
    
    h = c/((a+b)-2*b+c);
    System.out.println("\nd. O valor de H é: "+h);
    
    
}
}
