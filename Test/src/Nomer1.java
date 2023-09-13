import java.util.Scanner;
/* No 1. Buatlah code program dengan Bahasa pemograman apa saja untuk menentukan
jumlah hari di bulan Februari Tahun Berjalan
*/

public class Nomer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Tahun: ");
        int tahun = scanner.nextInt();
        // cek apakah tahun tersebut merupakan tahun kabisat
        boolean tahunKabisat = (tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0;
        // untuk tentukan jumlah hari pada bulan Februari
        int jumlahHariFebruari = tahunKabisat ? 29 : 28;
        // Print jumlah hari di bulan Februari
        System.out.println("Jumlah hari di bulan Februari " + tahun + " adalah " + jumlahHariFebruari);
    }
}