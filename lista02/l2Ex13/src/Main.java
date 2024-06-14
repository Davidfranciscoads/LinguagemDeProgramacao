// 3. Calculadora geométrica: exibir em um menu a opção de escolha entre três
// forma geométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção
// o programa deverá solicitar que o usuário insira os dados necessário para realizar
// os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos
// emseguida.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double base, altura, raio, area, circunferência;
        int op1;

        System.out.print("Selecione uma das seguintes formas geométricas:\n1- Círculo.\n2- Triângulo Retângulo.\n3- Retângulo.\n");
        op1 = scan.nextInt();


        switch (op1){

            case 1:
                System.out.println("Agora, informe as dimensões da forma geométrica escolhida:");
                System.out.print("Raio: ");
                raio = scan.nextDouble();
                area = Math.PI * Math.pow(raio,2);
                circunferência = 2 * Math.PI * raio;

                System.out.println("Área = "+area+"\nCircunferência = "+circunferência);
                break;

            case 2:
                System.out.println("Agora, informe as dimensões da forma geométrica escolhida:");
                System.out.print("Base: ");
                base = scan.nextDouble();

                System.out.print("Altura: ");
                altura = scan.nextDouble();
                double hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

                System.out.println("Área = "+(base*altura)/2+"\nPerímetro = "+(hipotenusa+base+altura));
                break;

            case 3:
                System.out.println("Agora, informe as dimensões da forma geométrica escolhida:");
                System.out.print("Base: ");
                base = scan.nextDouble();

                System.out.print("Altura: ");
                altura = scan.nextDouble();

                System.out.println("Área = "+(base*altura)+"\nPerímetro = "+((base+altura)*2));
                break;

            default:
                System.out.print("Opção inválida!");




        }

    }
}