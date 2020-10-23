import java.util.Scanner;

public class StringCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first operand: ");
        int first = sc.nextInt();
        while (true) {
            System.out.println("operator: ");
            String symbol = sc.next();
            if (symbol.equals("quit")) {
                break;
            }

            System.out.println("second operand: ");
            int second = sc.nextInt();
            int result = 0;
            switch (symbol) {
                case "+":
                    result = first + second;
                    System.out.println("add: " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("sub: " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("mul: " + result);
                    break;
                case "/":
                    result = first / second;
                    System.out.println("div: " + result);
                    break;

                default:
                    System.out.println("Invalid operation");
            }
            first = result;
        }
        sc.close();
    }
}
