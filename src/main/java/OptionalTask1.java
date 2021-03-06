import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class OptionalTask1 {

    public OptionalTask1() {}

    public void firstNameInput(){
        String userName = "";
        System.out.println("Task_1.1: ");
        System.out.println("InputName>> ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            userName = String.valueOf(in.readLine());
            System.out.println("Hi " + userName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void secondReversInput(){
        String userName = "";
        String reverse = "";
        System.out.println("Task_1.2: ");
        System.out.println("Enter text to reverse >> ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            userName = String.valueOf(in.readLine());
            for(int i = userName.length() - 1; i >= 0; i--)
            {
                reverse = reverse + userName.charAt(i);
            }

            System.out.println(reverse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void thirdRandomNum(){
        int count = 0;
        int num = 0;
        System.out.println("Task_1.3: ");
        System.out.println("Inpur random numbers count >> ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Random random = new Random();
        try {
            count = Integer.parseInt(in.readLine());
            for(int i = count; i > 0; i--)
            {
                num = random.nextInt(7000);
                if(num%2 == 0){
                    System.out.println(num + "  <<_  ");
                }else {
                    System.out.print(num + "  <<_  ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public void forthDigitSum(){
        int first = 0;
        int second = 0;

        System.out.println("Task_1.4: ");

        try {
            System.out.println("Enter first num >> ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            first = Integer.parseInt(in.readLine());
            System.out.println("Enter second num >> ");

            in = new BufferedReader(new InputStreamReader(System.in));
            second = Integer.parseInt(in.readLine());

            int result = first + second;

            System.out.println("Sum = " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.printf("%s%n%s%n", "End of task 1", "===========" );
    }
}
