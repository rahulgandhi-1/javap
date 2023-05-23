import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        start();
    }
    
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Login Page!");
        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        if (authenticate(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
            start(); // Restart the login process if authentication fails
        }
        
        scanner.close();
    }
    
    public static boolean authenticate(String username, String password) {
        // Perform authentication logic here
        // Replace this with your actual authentication code
        if (username.equals("admin") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}
