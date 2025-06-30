import java.util.Scanner;
class Problem1{
    double a, b;
    String operation;

    void calculate() {
        if (operation.equals("add")) {
            System.out.println(a + b);
        } else if (operation.equals("subtract")) {
            System.out.println(a - b);
        } else if (operation.equals("multiply")) {
            System.out.println(a * b);
        } else if (operation.equals("divide")) {

            if (b != 0)
                System.out.println(a / b);
            else System.out.println("Can't be divided by zero");
        } else {
            System.out.println("Invalid input");
        }


    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in) ;
        Problem1 calc = new Problem1();
        System.out.print("Enter first number: ");
        calc.a = sc.nextDouble();

        System.out.print("Enter second number: ");
        calc.b = sc.nextDouble();

        sc.nextLine();  
        System.out.print("Enter operation (add, subtract, multiply, divide) : ");
        calc.operation = sc.nextLine();
        calc.calculate();
    }
}
