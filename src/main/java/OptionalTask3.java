import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class OptionalTask3 {

    public OptionalTask3() {}

    public void monthInput(){
        String month = "" ;
        int num = 0;
        boolean exit = false;

        while (!exit){
            System.out.println("Month number input >> ");
            System.out.println("12 to exit >> ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            //main menu block
            try {
                num = Integer.valueOf(in.readLine());
                String[] months = new DateFormatSymbols(new Locale("en","US")).getMonths();
                //String month = "wrong";
                if (num == 12) {
                    exit = true;
                }else {
                    if (num >= 0 && num <= 11) {
                        month = months[num];
                    }
                    System.out.println(">>>  " + month);
                }

            } catch (IOException e) {
                System.err.println("Error: " + e);
            } catch (NumberFormatException e) {
                //System.out.println("You entered an invalid operation");
                System.err.println("wrong month");
                continue;
            }
        }



        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


    }
}
