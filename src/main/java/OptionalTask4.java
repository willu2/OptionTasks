import java.util.Arrays;
import java.util.Random;

public class OptionalTask4 {

    public OptionalTask4() {
    }


    public void printMassiveNN(int k)
    {
        int n = (int) Math.sqrt(k);
        int[][] workArray = new int[n][n];
        int a = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                a++;
                workArray[i][j] = a;
                System.out.print(workArray[i][j] + " ");
            }
            System.out.println();

        }

    }

    public void showMatrixRandValue(int k)
    {
        int maxValue = 0;

        Random random = new Random();
        int n = (int) Math.sqrt(k);
        int[][] workArray = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                workArray[i][j] = random.nextInt(300);
                if(workArray[i][j] > maxValue){
                    maxValue = workArray[i][j];
                }
                System.out.printf("%3s%s" ,workArray[i][j],  " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println(maxValue);
        System.out.println();
        sortMatrixColumn(workArray, n,n);

        removeMaxValueRow(workArray, maxValue);


    }

    public void sortMatrixColumn(int[][] a, int rowNum, int colNum) {
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < colNum; i++) {
            for (j = 0; j < rowNum; j++) {
                for (k = j + 1; k < rowNum; k++) {
                    if (i % 2 == 0) {          // to UP
                        if (a[j][i] > a[k][i]) {
                            int temp1 = a[j][i];
                            a[j][i] = a[k][i];
                            a[k][i] = temp1;
                        }
                    } else {
                        if (a[j][i] < a[k][i]) {  //to DOWN
                            int temp1 = a[j][i];
                            a[j][i] = a[k][i];
                            a[k][i] = temp1;
                        }
                    }
                }
            }
        }
        for (int r = 0; r < colNum; r++) {
            for (int m = 0; m < rowNum; m++) {
                System.out.printf("%3s%s" ,a[r][m],  " ");
            }
            System.out.println();
        }
    }

    public void removeMaxValueRow(int[][] workArray, int maxVal) {
        int[][] temp = workArray;
        int row = 0;
        int col = 0;
        System.out.println();System.out.println();
        for (int r = 0; r < temp.length; r++) {
            for (int m = 0; m < temp[r].length; m++) {
                if(temp[r][m] == maxVal){
                    row = r;
                    col = m;
                    System.out.println("nn>>>>>>>" + temp[r][m]);
                    System.out.println(">>" + r +" --" + m );
                }
               // System.out.printf("%3s%s" , temp[r][m],  " ");
            }
            System.out.println();
        }
    }
}
