import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
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
        //task2.firstMaxMin2_1_2();
        //task2.MidLenMin2_3();
        //task2.digitMinFind2_4();
        //task2.twinDigitFind2_5temo();
        //task2.increasingNumbers2_6();
        //task2.differentDigitFind2_7();


        OptionalTask3 task3 = new OptionalTask3();
        task3.monthInput();


    }



//=========================================third================================



   public static String getMonthForInt(int num) {
       String[] months = new DateFormatSymbols(new Locale("en","US")).getMonths();
        String month = "wrong";

        if (num >= 0 && num <= 11 ) {
            month = months[num];
        }
        return month;
    }
}


