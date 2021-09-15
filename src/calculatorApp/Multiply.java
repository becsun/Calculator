package calculatorApp;

public class Multiply{
    private int one;
    private int two;


    public Multiply(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int getMultiplied(){
        return this.one * this.two;
    }

}
