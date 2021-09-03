package calculatorApp;

import java.util.Random;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        int randomNumberTwo = random.nextInt(100);

//        System.out.println("Random number one:" + randomNumber + "\n" +
//                            "Random number two: "+randomNumberTwo);

//        System.out.println( "Enter an operation to perform: + (add), * (multiply) or - (subtract).");
//
//        Scanner scanner = new Scanner(System.in); String input = scanner.next();
//
//        if (input.equals("+")){
//            System.out.println(randomNumber + randomNumberTwo);
//        }else if  (input.equals("-")){
//            System.out.println(randomNumber - randomNumberTwo);
//        }else if  (input.equals("*")) {
//            System.out.println(randomNumber * randomNumberTwo);
//        }

        System.out.println("pick a number:");
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        System.out.println("pick another number:");
        int numTwo = scanner.nextInt();
        System.out.println( "Enter an operation to perform: + (add), * (multiply) or - (subtract).");
        String operator = scanner.next();

        if (operator.equals("+")){
            System.out.println(numOne +" + "+ numTwo + " = " + numOne + numTwo);
        }else if  (operator.equals("-")){
            System.out.println(numOne +" - "+ numTwo + " = " + (numOne - numTwo));
        }else if  (operator.equals("*")) {
            System.out.println(numOne +" * "+ numTwo + " = " +numOne * numTwo);
        }

    }
}
