public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int dif(int a, int b) {
        return a - b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c){
        int fistSum = add(a, b);
        int secondSum = add(b, c);
        return times(fistSum, secondSum);
    }
}