package ie.gmit.polymorphism;
public class Main {
    public static void main(String[] args) {
       
        Calculator calcObj1 = new Calculator();

        //Creating a calculator object
       System.out.println( calcObj1.add(5, 10) );
       System.out.println( calcObj1.add(5, 10, 20) );
       System.out.println( calcObj1.subtract(10, 5) );
       System.out.println( calcObj1.subtract(20, 10) );
        

    }
        

}