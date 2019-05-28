import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OptionalMain {

    public static void main(String[] args) {

       OptionalTask1 task1 = new OptionalTask1();
       // task1.firstNameInput();
       // task1.secondReversInput();
       // task1.thirdRandomNum();
       // task1.forthDigitSum();

//===============================================================//

       // forthDigitSum();
        characterFind();

    }


//=========================================second================================

    public static void forthDigitSum(){
        int first = 0;
        int minNum = 0;
        int maxLenth = 0;
        int minLenth = 1000;

        ArrayList<Integer> integers = new ArrayList<Integer>();

        try {
            System.out.println("Enter num >> ");
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

            piramidPrint(integers);

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void piramidPrint(ArrayList<Integer> integers){
            Collections.sort(integers);
            for (int i : integers){
                System.out.println(i);
    }
            Collections.reverse(integers);
            for (int i : integers){
                System.out.println(i);
            }
    }


    public static void characterFind(){

        String s = "aaaaabkjvbvbvbzjfdhvjfb fdjbv kjfvdbdvbjbfdjkvnkjjhlkglkhsfdjghfkjdhfdnkjvnk";
        ArrayList<String>  strings = new ArrayList<>();
        String temp = "";
        Character character = 'b';
        for (int i = 0; i < s.length(); i++) {
//            character = s.charAt(i);
            if(character == s.charAt(i)){
                temp += s.charAt(i);
                //s.
            }
           // System.out.println(temp + "  " + temp.length() + " >>" + temp.charAt(0));
        }

        String input = s.toLowerCase();// Make your input toLowerCase.
        int[] alphabetArray = new int[26];
        for ( int i = 0; i < input.length(); i++ ) {
            char ch =  input.charAt(i);
            int value = (int) ch;
            if (value >= 97 && value <= 122){
                alphabetArray[ch-'a']++;
            }
        }

        for (int i = 0; i < alphabetArray.length; i++) {
            if(alphabetArray[i] > 0){
                char ch = (char) (i + 97);
                System.out.println(ch + "  : " + alphabetArray[i]);   //Show the result.
            }
        }
    }
}


