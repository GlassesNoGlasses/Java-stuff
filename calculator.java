import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Choose: '-', '+', '/', '*' ");
        try (Scanner scan = new Scanner(System.in)) {
            String action = scan.nextLine();
            System.out.println("Input first number");
            float i = scan.nextFloat();
            System.out.println("Input second number");
            float j = scan.nextFloat();
            switch (action) {
                case "-":
                System.out.println("Result: " + (i - j));
                    break;
            
                case "+":
                System.out.println("Result: " + (i + j));
                    break;
            
                case "/":
                System.out.println("Result: " + (i / j));
                    break;
                
                case "*":
                System.out.println("Result: " + (i * j));
                    break;
                default:
                    System.out.println("inputed choice is invalid");
                    break;
            }
        } catch (Exception e) {
            System.out.println("inputed value(s) is invalid");
        }
    }
}
