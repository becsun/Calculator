package calculatorApp;

import java.util.Random;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumberTwo = random.nextInt(100);


        System.out.println("Random number one:" + randomNumber + "\n" +
                            "Random number two: "+randomNumberTwo);

        System.out.println( "Enter an operation to perform: + (add), * (multiply) or - (subtract).");

        Scanner scanner = new Scanner(System.in); String input = scanner.next();

        if (input.equals("+")){
            System.out.println(randomNumber + randomNumberTwo);
        }else if  (input.equals("-")){
            System.out.println(randomNumber - randomNumberTwo);
        }else if  (input.equals("*")) {
            System.out.println(randomNumber * randomNumberTwo);
        }
    }
}
