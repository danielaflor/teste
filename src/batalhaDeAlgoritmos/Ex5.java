/*PARA EXECUTAR PRESSIONE SHIFT + F6 */
package batalhaDeAlgoritmos;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double pedagio, consumoMedio, valorLitro, litros, total;
        
        /*System.out.println("Digite o valor gasto com pedágio: ");
        pedagio = entrada.nextDouble();
        System.out.println("Digite o consumo médio do veículo em km/l: ");
        consumoMedio = entrada.nextDouble();
        System.out.println("Digite o valor do litro do combustível: ");
        valorLitro = entrada.nextDouble();
        
        litros = 67/consumoMedio;
        total = pedagio + litros*valorLitro;*/
        
        total = 107;
        
        if (total <= 100) {
            System.out.println("vamos para Maringá passear?");
        }
        else
            if (total > 100 && total <=150) {
                System.out.println("“Essa viagem vai custar caro!!!");
            }
            else
                if (total >150 && total <= 200) {
                   System.out.println("Que tal escolhermos um destino mais próximo?"); 
                }
                else{
                    System.out.println("Vamos ficar em Paranavaí city mesmo!!!!");
                }
                
            
    }
}
