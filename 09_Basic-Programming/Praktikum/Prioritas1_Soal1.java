import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan alas: ");
        double alasSegitiga = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggiSegitiga = input.nextDouble();
        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        System.out.println("Luas segitiga: " + luasSegitiga);

        System.out.println("\nMenghitung Luas Persegi Panjang");
        System.out.print("Masukkan panjang: ");
        double panjangPersegiPanjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebarPersegiPanjang = input.nextDouble();
        double luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        System.out.println("\nMenghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double jariJariLingkaran = input.nextDouble();
        double phi = 3.14; 
        double luasLingkaran = phi * Math.pow(jariJariLingkaran, 2);
        System.out.println("Luas lingkaran: " + luasLingkaran);

        input.close();
    }
}
