import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                System.out.println("Exiting program.");
                break;
            }

            int result = 0;
            switch (operation) {
                case "add":
                    result = calculator.add(scanner.nextInt(), scanner.nextInt());
                    break;
                case "subtract":
                    result = calculator.subtract(scanner.nextInt(), scanner.nextInt());
                    break;
                case "multiply":
                    result = calculator.multiply(scanner.nextInt(), scanner.nextInt());
                    break;
                case "fibonacci":
                    result = calculator.fibonacciNumberFinder(scanner.nextInt());
                    break;
                case "binary":
                    String binaryResult = calculator.intToBinaryNumber(scanner.nextInt());
                    System.out.println("Output: " + binaryResult);
                    continue;
                default:
                    System.out.println("Invalid operation. Please try again or type 'exit' to quit.");
                    continue;
            }

            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}
