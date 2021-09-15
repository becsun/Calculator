package calculatorApp;

import java.util.Scanner;

public class Calculator implements Calculation{

    private int one;
    private int two;
    private String operator;

    public Calculator(int one, int two, String operator) {
        this.one = one;
        this.two = two;
        this.operator = operator;

    }

    @Override
    public void minus() {
        Minus minusResult = new Minus(this.one,this.two);
        System.out.println(this.one +" - "+ this.two + " = " + minusResult.getMinus());
    }

    @Override
    public void add() {
        Add addResult = new Add(this.one,this.two);
        System.out.println(this.one +" + "+ this.two + " = " + addResult.getAdd());
    }

    @Override
    public void multiply() {
        Multiply multiplyResult = new Multiply(this.one,this.two);
        System.out.println(this.one +" * "+ this.two + " = " + multiplyResult.getMultiplied());
    }


    public static void main(String[] args) {

        System.out.println("Welcome to the calculator!");
        System.out.println("pick a number:");
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        System.out.println("pick another number:");
        int numTwo = scanner.nextInt();
        System.out.println( "Enter an operation to perform: + (add), * (multiply) or - (subtract).");
        String operator = scanner.next();

        if (operator.equals("-")){
            Calculator minus = new Calculator(numOne,numTwo,"-");
            minus.minus();
        }else if (operator.equals("+")){
            Calculator add = new Calculator(numOne,numTwo,"+");
            add.add();
        }else if (operator.equals("*")) {
            Calculator multiply = new Calculator(numOne,numTwo,"*");
            multiply.multiply();
        }
    }
}
