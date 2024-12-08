import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Code Smell: Hardcoded credentials
        String username = "admin";
        String password = "1234";

        System.out.println("Welcome to the DemoApp!");
        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        // Vulnerability: Insecure password comparison
        if (username == inputUsername && password == inputPassword) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }

        // Code Smell: Unused variable
        int unusedVariable = 42;

        // Bug: Potential null pointer exception
        String data = null;
        System.out.println("Data length: " + data.length());

        // Bug: Infinite loop
        while (true) {
            System.out.println("Press 'q' to quit.");
            String command = scanner.nextLine();
            if (command.equals("q")) {
                break;
            }
        }

        scanner.close();
    }
}
