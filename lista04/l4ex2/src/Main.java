//2. Declare e inicialize um vetor de 10 posições, em seguida percorra este vetor
// alterandoseus valores conforme a seguinte regra: some 2 a todos os valores situados
// em posiçõescom índice par e para as posições de índice ímpar multiplique seu valores
// por 2
public class Main {
    public static void main(String[] args) {

        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i< vector.length;i++){
            if (i%2==0)

                vector[i]+=2;

            else
                vector[i]*=2;

            System.out.println(vector[i]);


        }
    }
}