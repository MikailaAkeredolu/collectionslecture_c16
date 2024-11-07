package lastOfdamohicans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Use a scanner to ask for a numerator and a denominator
    //if someone enters a zero
    // .. print a message NOT the stacktrace
    //allow them to try again

    public static int divide(int numerator, int denominator){
        try{
            return numerator / denominator;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide " + e.getMessage());
            e.printStackTrace();
        }

       return 0;
    }


    public static void main(String[] args) {
        doCalc();
        //Unchecked exception - Runtime exception
//        int answer  = divide(10, 0);
//        System.out.println(answer);

        //Only using an int, create a static method named DIVIDE
        //that returns the division of the numerator by the denominator




    }





        public static void doCalc() {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do{
            try {
                System.out.println("enter numerator");
                int x = scanner.nextInt();
                System.out.println("enter denominator");
                int y = scanner.nextInt();
                System.out.println(x / y);
                flag = false;
            }catch(ArithmeticException exception){
                scanner.nextLine();
                //exception.printStackTrace();
                System.out.println("Cannot be divided by zero. Try again");
            }catch (InputMismatchException inputMismatchException){
                scanner.nextLine();
                //inputMismatchException.printStackTrace();
                System.out.println("You must enter integer values only. Try again");
            }

        }while(flag);
    }

}
