import java.util.Scanner;

public class StringCalculatorMain {
    static String[] inputStatement(Scanner sc) {
        String inputStream = sc.nextLine();
        return inputStream.split(" ");
    }

    static int getOperand(String operand) {
        return Integer.parseInt(operand);
    }

    static int calculate(String symbol, int first, int second) {
        int result = 0;
        switch (symbol) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;

            default:
                System.out.println("Invalid operation");
        }
        return result;
    }
    static void print(int result) {
        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep calculate");

        String[] values = inputStatement(sc);
        int i = 0;
        int result = getOperand(values[i++]);
        do {
            String symbol = values[i++];
            int second = getOperand(values[i++]);
            result = calculate(symbol, result, second);
        } while (i < values.length);
        print(result);
        sc.close();
    }
}
