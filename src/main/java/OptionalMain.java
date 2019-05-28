import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalMain {

    public static void main(String[] args) {

       OptionalTask1 task1 = new OptionalTask1();
       // task1.firstNameInput();
       // task1.secondReversInput();
       // task1.thirdRandomNum();
       // task1.firstMaxMin2_1();

//===============================================================//
        OptionTask2 task2 = new OptionTask2();
        //task2.firstMaxMin2_1();
        //task2.firstMaxMin2_1();

        //characterFind();

    }


//=========================================second================================




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


