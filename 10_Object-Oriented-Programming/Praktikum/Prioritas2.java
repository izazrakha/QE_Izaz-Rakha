public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid");
            return -1;
        }
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        int resultAdd = add(num1, num2);
        int resultSubtract = subtract(15, 4);
        int resultMultiply = multiply(10, 10);
        double resultDivide = divide(12, 3);

        System.out.println("Penjumlahan: " + resultAdd);
        System.out.println("Pengurangan: " + resultSubtract);
        System.out.println("Perkalian: " + resultMultiply);
        if (resultDivide != -1) {
            System.out.println("Pembagian: " + resultDivide);
        }
    }
}
