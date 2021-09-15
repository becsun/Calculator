package calculatorApp;

public class Add{
    private int one;
    private int two;

    public Add(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int getAdd(){
        return this.one + this.two;
    }

}
