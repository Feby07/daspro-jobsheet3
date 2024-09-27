import java.util.Scanner;

public class Tagihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean penggunaanBerlebih;
        double tarifPerKwh = 1500.0;
        double penggunaanKwh, totalTagihan;

        System.out.println("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanKwh = input.nextDouble();

        totalTagihan = penggunaanKwh * tarifPerKwh;

        penggunaanBerlebih = penggunaanKwh > 500;
     
        System.out.println("Total Tagihan Listrik: Rp " + totalTagihan);
        if (penggunaanBerlebih) {
            System.out.println("Penggunaan listrik melebihi 500 kWh.");
        } else{
            System.out.println("Penggunaan listrik tidak melebihi 500 kWh.");
        }
    }
}