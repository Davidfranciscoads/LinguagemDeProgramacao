//10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a
// matriz produtoentre as duas matrizes
public class Main {
    public static void main(String[] args) {
        int [][] a ={{5,6},
                {8,7},
                {3,3}};

        int [][] b = {{9,1},
                {6,1}};

        int [][] c = new int [3][2];

        for(int i=0;i<a.length;i++){
            c[i][0]=a[i][0]*b[0][0]+a[i][1]*b[1][0];
            c[i][1]=a[i][0]*b[0][1]+a[i][1]*b[1][1];
        }

        for(int [] line : c) {
            for(int value:line)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}
