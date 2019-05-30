import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

public class OptionalTask4 {

    private int[][] data;

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

    public void showMatrixRandValue()
    {
        int k = readConsole();
        int maxValue = 0;

        Random random = new Random();
        //int n = (int) Math.sqrt(k);
        int n = k;
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
        System.out.printf("%n%d%s", maxValue , "  <<max value in the matrix");
        System.out.println();
        System.out.printf("%s%n%s", "sorted matrix", "------------------");
        System.out.println();
        sortMatrixUpColumn(workArray, n,n);
        sortMatrixToDown(workArray, n,n);

        //removeMaxValueRow(workArray, maxValue);

        makeMatrixTT(workArray);
        removeRowsWithValueTT(maxValue);

    }

    public void sortMatrixUpColumn(int[][] a, int rowNum, int colNum) {
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < colNum; i++) {
            for (j = 0; j < rowNum; j++) {
                for (k = j + 1; k < rowNum; k++) {
                     // to UP
                        if (a[j][i] > a[k][i]) {
                            int temp1 = a[j][i];
                            a[j][i] = a[k][i];
                            a[k][i] = temp1;
                        }
                }
            }
        }
        System.out.printf("%s%n%s", "sorted UP matrix", "------------------");
        System.out.println();
        for (int r = 0; r < colNum; r++) {
            for (int m = 0; m < rowNum; m++) {
                System.out.printf("%3s%s" ,a[r][m],  " ");
            }
            System.out.println();
        }
    }

    public void sortMatrixToDown(int[][] a, int rowNum, int colNum) {
        int i = 0;
        int j = 0;
        int k = 0;

        for (i = 0; i < colNum; i++) {
            for (j = 0; j < rowNum; j++) {
                for (k = j + 1; k < rowNum; k++) {

                        if (a[j][i] < a[k][i]) {  //to DOWN
                            int temp1 = a[j][i];
                            a[j][i] = a[k][i];
                            a[k][i] = temp1;
                        }
                }
            }
        }
        System.out.printf("%s%n%s", "sorted DOWN matrix", "------------------");
        System.out.println();
        for (int r = 0; r < colNum; r++) {
            for (int m = 0; m < rowNum; m++) {
                System.out.printf("%3s%s" ,a[r][m],  " ");
            }
            System.out.println();
        }
    }

    public void makeMatrixTT(int[][] data){
        int r = data.length;
        int c = data[0].length;
        this.data = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public void removeRowsWithValueTT(final int value)
    {
            /* arraylist makes dynamically  */
        List<int[]> rowsToKeep = new ArrayList<int[]>(this.data.length);
        for(int[] row : this.data)
        {
            /* If you download Apache Commons, it has built-in array search
                      methods so you don't have to write your own */
            boolean found = false;
            for(int testValue : row)
            {
                if(Integer.compare(value,testValue) == 0)
                {
                    found = true;
                    break;
                }
            }
                               if(!found)
            {
                rowsToKeep.add(row);
            }
        }

            /* now that we know what rows we want to keep, make our
               new 2D array with only those rows */
        this.data = new int[rowsToKeep.size()][];
        for(int i=0; i < rowsToKeep.size(); i++)
        {
            this.data[i] = rowsToKeep.get(i);
        }
        System.out.println();
        System.out.println("-------refactored------");
        for (int r = 0; r < data.length; r++) {
            for (int m = 0; m < data[r].length; m++) {
                System.out.printf("%3s%s" ,data[r][m],  " ");
            }
            System.out.println();
        }

    }
    public int readConsole(){
    int num = 0;

        System.out.println("Input matrix size [n]>> ");
        System.out.println("0 to exit >> ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                num = Integer.valueOf(in.readLine());

            } catch (IOException e) {
                System.err.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.err.println("wrong data");
    }return num;
    }

}
