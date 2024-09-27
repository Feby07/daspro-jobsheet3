import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double jamKerja, upahPerJam, gajiSebelumBonus, bonus, totalGaji, pajak, gajiAkhir;
        final double persentaseBonus = 10 / 100.0;
        final double persentasePajak = 5 / 100.0;

        System.out.println("Masukkan jumlah jam kerja dalam sebulan: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan upah per jam (Rp): ");
        upahPerJam = input.nextDouble();
     
        gajiSebelumBonus = jamKerja * upahPerJam;

        bonus = persentaseBonus * gajiSebelumBonus;

        totalGaji = gajiSebelumBonus + bonus;

        pajak = persentasePajak * totalGaji;

        gajiAkhir = totalGaji - pajak;

        System.out.println("Gaji sebelum bonus: Rp " + gajiSebelumBonus);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Gaji setelah bonus sebelum pajak: Rp " + totalGaji);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);
    }
}
