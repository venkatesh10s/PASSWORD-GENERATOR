import java.util.Random;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final String ALL = UPPER + LOWER + DIGITS + SYMBOLS;

    public static String generatePassword(int length) {
        if (length < 6) {
            return "Password should be at least 6 characters.";
        }

        StringBuilder pass = new StringBuilder();
        Random rand = new Random();

        // Add one character from each set
        pass.append(UPPER.charAt(rand.nextInt(UPPER.length())));
        pass.append(LOWER.charAt(rand.nextInt(LOWER.length())));
        pass.append(DIGITS.charAt(rand.nextInt(DIGITS.length())));
        pass.append(SYMBOLS.charAt(rand.nextInt(SYMBOLS.length())));

        for (int i = 4; i < length; i++) {
            pass.append(ALL.charAt(rand.nextInt(ALL.length())));
        }

        return shuffle(pass.toString());
    }

    private static String shuffle(String str) {
        char[] arr = str.toCharArray();
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }
}
