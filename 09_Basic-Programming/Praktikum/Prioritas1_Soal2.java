import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga beli: ");
        int hargaBeli = input.nextInt();

        System.out.print("Masukkan harga jual: ");
        int hargaJual = input.nextInt();

        int keuntunganRugi = hargaJual - hargaBeli;

        if (keuntunganRugi > 0) {
            System.out.println("Untung sebesar: " + keuntunganRugi);
        } else if (keuntunganRugi < 0) {
            System.out.println("Rugi sebesar: " + keuntunganRugi);
        } else {
            System.out.println("Sama saja");
        }

        input.close();
    }
}
