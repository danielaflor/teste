package meuprojeto;

import java.util.Scanner;

public class MeuProjeto {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        MeuProjeto meuProj = new MeuProjeto();
        //meuProj.perguntarImprimirIdade();
        //String idade = meuProj.perguntarIdade();
        //meuProj.imprimirIdade("Usuario","20");
        //meuProj.imprimirIdade("Usuário", idade);
        //operadores();
        int A = 99;
        int B = 98;
        boolean X = A > B;
        boolean Y = A == B;
        boolean Z = A < B;
        System.out.println("X:" +X);
        System.out.println("Y:" +Y);  
        System.out.println("Z:" +Z);
        System.out.println(X || Y);
        System.out.println(X && Y && Z);
        System.out.println(X && (Y || Z));
        System.out.println((X && (!Y)) || Z);
        System.out.println((!Y));
        System.out.println((X && (!Y)));
        System.out.println((X && (!Y)) || Z);
    }

    public void perguntarImprimirIdade() {
        System.out.print("Informe sua idade: ");
        String idade = entrada.nextLine();
        System.out.println("A idade informada é: " + idade);
    }

    public String perguntarIdade() {
        System.out.print("Informe sua idade: ");
        String idade = entrada.nextLine();
        return idade;
    }

    public void imprimirIdade(String idade) {
        System.out.println("A idade informada é: " + idade);
    }

    public void imprimirIdade(String mensagem, String idade) {
        System.out.println(mensagem + ", a idade informada é: " + idade);
    }

    public static void operadores() {
       int x = 1; // Atribui 1 a x   
        System.out.println(x += 5); // Equivalente a x = x + 5; x é igual a 6   
        System.out.println(x *= 2); // Equivalente a x = x * 2; x é igual a 12   
        System.out.println(x /= 2); // Equivalente a x = x / 2; X é igual a 6   
        System.out.println(x -= 3); // Equivalente a x = x - 3; x é igual a 3   
        System.out.println(x %= 5); // Equivalente a x = x % 5; x é igual a 3   
        System.out.println(6%3);
        System.out.println(8%2);
        System.out.println(3%2);
        System.out.println(3 + 2 - 10 % 5 * 2 );
        System.out.println(2.000+"2");
        float y = 0.0f;
    }
    
}

