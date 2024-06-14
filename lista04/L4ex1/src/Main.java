//1. Declare e inicialize um vetor de 10 posições, em seguida imprima este
// vetor em ordem inversa

public class Main {
    public static void main(String[] args) {

        int vetor[] = new int[10];

        System.out.println(vetor.length);

        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = i;
            System.out.println(" " + vetor[i]);
        }
    }
}

    
