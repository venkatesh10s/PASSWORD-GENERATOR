import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== PASSWORD GENERATOR =====");
        System.out.print("Enter the password length: ");
        int len = input.nextInt();

        String password = PasswordGenerator.generatePassword(len);

        System.out.println("Generated Password: " + password);
        input.close();
    }
}
