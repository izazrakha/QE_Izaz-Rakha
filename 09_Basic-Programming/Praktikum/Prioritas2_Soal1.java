import java.util.Scanner;

public class Main {

    public static void drawXYZ(int height) {
        int currentValue = 1; 
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (currentValue % 3 == 0) {
                    System.out.print("X ");
                } else if (currentValue % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
                currentValue++;
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola: ");
        int height = input.nextInt();
        drawXYZ(height);
        input.close();
    }
}
