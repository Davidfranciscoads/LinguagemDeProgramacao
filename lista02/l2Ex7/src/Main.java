// 7. Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir
// a solução(x1 e x2). Equação do segundo grau: ax2+bx+c=0. Exibir uma mensagem de
// aviso quando não houver raízes no conjunto de números Reais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, x1, x2, delta;

        Scanner in =  new Scanner(System.in);
        System.out.println("Digita a, b e c sepados por espaço:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b,2) - 4*a*c;

        if(delta<0){
            System.out.println("Equacao sem raiz");
        }else{
            x1 = (b*-1 + Math.sqrt(delta))/(2*a);
            x2 = (b*-1 - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + " e x2 = " +x2);
        }
    }
}