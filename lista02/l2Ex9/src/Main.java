//9.  Dados três valores, verificar se eles podem ser valores dos lados de um
// triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
// Condição de existência de um triângulo: a medida de qualquer um dos lados de um
// triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença
// entre essas mesmas medidas.Triângulo equilátero: possui todos os lados iguais.
// Triângulo isósceles: possui apenas dois lados iguais.Triângulo escaleno: todos os lados
// são diferentes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com as tres medidas: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a<b+c && a>Math.abs(b-c) &&
                b<a+c && b>Math.abs(a-c) &&
                c<b+a && c>Math.abs(b-a)){
            if(a==b && a==c)
                System.out.println("Triangulo equilatero");
            else if (a==b || a==c || b==c)
                System.out.println("Triangulo isoceles");
            else
                System.out.println("Triangulo escaleno");
        }else
            System.out.println("Os valores digitados não formam um triângulo");
    }
}