import java.util.Scanner;

public class StringCalculatorMain {
    static int getFistValue(Scanner sc) {
        System.out.println("first operand: ");
        return sc.nextInt();
    }

    static int getSecondVal(Scanner sc) {
        System.out.println("second operand: ");
        return sc.nextInt();
    }

    static String getSymbol(Scanner sc) {
        System.out.println("operator: ");
        return sc.next();
    }

    static int calculate(String symbol, int first, int second) {
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
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep calculate");

        int result = getFistValue(sc);

        while (true) {
            String symbol = getSymbol(sc);
            if (symbol.equals("quit")) {
                break;
            }
            int second = getSecondVal(sc);
            result = calculate(symbol, result, second);

            System.out.println(result);
        }
        sc.close();
    }
}
