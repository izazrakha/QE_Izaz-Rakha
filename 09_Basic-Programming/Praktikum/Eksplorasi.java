import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks yang ingin dienkripsi: ");
        String plaintext = input.nextLine();
        String encryptedText = encrypt(plaintext);
        System.out.println("Teks terenkripsi: " + encryptedText);
        input.close();
    }

    public static String encrypt(String input) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                char encryptedChar = (char) (base + (currentChar - base + 10) % 26);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }
}
