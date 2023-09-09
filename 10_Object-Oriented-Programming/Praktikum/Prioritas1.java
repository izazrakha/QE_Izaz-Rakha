public class Product {
    private String nama;
    private String deskripsi;
    private double harga;
    private int jumlahStok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void getInfo() {
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + getNama());
        System.out.println("deskripsi: " + getDeskripsi());
        System.out.println("harga: " + getHarga());
        System.out.println("jumlah stok: " + getJumlahStok());
        System.out.println("===");
    }

    public static void main(String[] args) {
        Product produk1 = new Product();
        produk1.setNama("coffee");
        produk1.setDeskripsi("this is coffee");
        produk1.setHarga(15000);
        produk1.setJumlahStok(10);
        produk1.getInfo();

        Product produk2 = new Product();
        produk2.setNama("milk");
        produk2.setDeskripsi("this is fresh milk");
        produk2.setHarga(25000);
        produk2.setJumlahStok(10);
        produk2.getInfo();

        Product produk3 = new Product();
        produk3.setNama("apple juice");
        produk3.setDeskripsi("this is juice");
        produk3.setHarga(18000);
        produk3.setJumlahStok(20);
        produk3.getInfo();
    }
}
