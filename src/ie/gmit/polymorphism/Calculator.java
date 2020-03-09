package ie.gmit.polymorphism;
public class Calculator {
    
    

    public int add(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("i am the add method with 2 ints");
        return sum;
    }

    public int add(int a, int b, int c) {
        int sum;
        sum = a + b + c;
        System.out.println("i am the add method with 3 ints");
        return sum;
    }

    public int subtract(int a, int b) {
        int result;
        result = a - b;
        System.out.println("i am the subtract method with 2 ints");
        return result;
    }

    public double subtract(double a, double b) {
        double result;
        result = a - b;
        System.out.println("i am the subtract method with 2 doubles");
        return result;
    }

}