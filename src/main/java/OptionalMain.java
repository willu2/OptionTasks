import java.util.*;

public class OptionalMain {

    public static void main(String[] args) {

       OptionalTask1 task1 = new OptionalTask1();
       // task1.firstNameInput();
       // task1.secondReversInput();
       // task1.thirdRandomNum();
       // task1.firstMaxMin2_1();

//===============================================================//
        OptionalTask2 task2 = new OptionalTask2();
        //task2.firstMaxMin2_1();
        //task2.firstMaxMin2_3();
        task2.digitMinFind2_4();


        //characterFind();

        //digitFind();
        //searchDigitPlusOne();

       // findValueWithMinSameChars();
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



    public static void searchDigitPlusOne()
    {
        int[] values = {00131551, 455444412, 847777, 56211, 455645, 55411, 12215, 8412377, 521211, 453345, 411, 2345};
        for(int value : values)
        {
            int[] valuesArray = getCharsOfInteger(value);
            int[] templateArray =  new int[valuesArray.length];
            templateArray = Arrays.copyOfRange(valuesArray, 0, valuesArray.length);
            bubbleSort(templateArray);

            if(Arrays.equals(templateArray, valuesArray) ) {System.out.println(value); break;};

        }

    }

    public static int[] getCharsOfInteger(int number) // Integer is divided into separate elements
    {
        int[] elements = new int[getCountsOfDigits(number)];
        for (int i = 0; i < elements.length ; i++)
        {
            elements[elements.length - i - 1] =  number % 10;
            number /= 10;
        }

        return elements;
    }


    public static void bubbleSort(int[] values) // sort form min to max
    {
        int tmp = 0;
        for (int i = values.length; i > 0 ; i--)
        {
            for (int j = 0; j < values.length - 1 ; j++)
            {
                if(values[j] > values[j + 1 ])
                {
                    tmp = values[j +1 ];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                }
            }
        }
    }


    public static int getCountsOfDigits(int number) // Count number of char in Integer
    {
        int count = (number == 0) ? 1 : 0;
        while (number != 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }
}


