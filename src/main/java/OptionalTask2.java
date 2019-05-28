import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalTask2 {

    public OptionalTask2() {
    }

    public void firstMaxMin2_1(){  //2.1 task
        int first = 0;
        int minNum = 0;
        int maxLenth = 0;
        int minLenth = 1000;

        ArrayList<Integer> integers = new ArrayList<Integer>();

        try {

            BufferedReader in;
            for (int i = 1; i < 6; i++ ){
                System.out.println("Enter num >> " + i);
                in = new BufferedReader(new InputStreamReader(System.in));
                first = Integer.parseInt(in.readLine());
                integers.add(first);

            }

            for (int i : integers){
                int numberOfDigits = String.valueOf(i).length();

                if(numberOfDigits > maxLenth){
                    maxLenth = numberOfDigits;
                    first = i;
                }

                if(minLenth > numberOfDigits ){
                    minLenth = numberOfDigits;
                    minNum = i;
                }
            }
            System.out.println(first + " >>> " + maxLenth );
            System.out.println(minNum + " >>> " + minLenth );

            piramidPrint2_2(integers); ///2.2 task

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void piramidPrint2_2(ArrayList<Integer> integers){
        Collections.sort(integers);
        for (int i : integers){
            System.out.println(i);
        }
        Collections.reverse(integers);
        for (int i : integers){
            System.out.println(i);
        }
    }

    public void firstMaxMin2_3(){  //2.3 task
        int digt = 0;
        int mid = 0;

        ArrayList<Integer> length = new ArrayList<Integer>();
        ArrayList<Integer> integers = new ArrayList<Integer>();

        try {
            BufferedReader in;
            for (int i = 0; i < 7; i++ ){
                System.out.printf("%s%d","Enter number >> ", i+1);
                System.out.println();
                in = new BufferedReader(new InputStreamReader(System.in));
                digt = Integer.parseInt(in.readLine());
                int numberOfDigits = String.valueOf(digt).length();
                integers.add(digt);
                length.add(numberOfDigits);
                mid += numberOfDigits;

            }
            mid /= length.size();
            System.out.println(mid);
            System.out.println("Max mid >> ");
            for (int i = 0; i < length.size(); i++) {
                if(length.get(i) > mid){
                    System.out.println( integers.get(i) + "  >> " + length.get(i) );
                }
            }

            System.out.println("Min mid >> ");
            for (int i = 0; i < length.size(); i++) {
                if(length.get(i) <= mid){
                    System.out.println( integers.get(i) + "  >> " + length.get(i) );
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid operation");
            //continue;   // go to beginning of loop
        }
    }

    public void digitMinFind2_4(){

        String s[] = {"00131551", "455444412", "847777", "56211", "455645", "55411", "1115"};
        int[] countDigit = new int[s.length];
        int maxIndex = 0;
        int maxValue = 0;
        int minIndex = 0;
        int minValue = 10000;

        for (int i = 0; i < s.length; i++) {
            s[i].replaceAll("\\D+", "");
            int[] alphabetArray = new int[9];

            for (int m = 0; m < s[i].length(); m++) {
                char ch = s[i].charAt(m);
                int value = (int) ch;
                if (value >= 48 && value <= 57) {
                    alphabetArray[ch - '0']++;
                    if (alphabetArray[ch - '0'] > 1) {
                        countDigit[i]++;
                    }
                }
            }

            for (int r = 0; r < countDigit.length; r++) {
                if (countDigit[r] > 0) {
                    //System.out.println( r + "  : " + countDigit[r] + " <<<<<");   //Show the result.
                    if (countDigit[r] > maxValue) {
                        maxValue = countDigit[r];
                        maxIndex = r;
                    }
                    if (countDigit[r] < minValue) {
                        minValue = countDigit[r];
                        minIndex = r;
                    }
                }
            }
        }
            System.out.println(s[maxIndex] + " << max value");   //Show the result.
            System.out.println(s[minIndex] + " << min value");   //Show the result.
            System.out.println("---------------");   //Show the result.

    }
}
