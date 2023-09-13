import java.util.Scanner;
public class Nomer4 {
    public static void main(String[] args) {
        /*
        No 4.Buatkan code program (dengan bahasa yang anda kuasai) /pseudocode (algoritma)
        untuk menghitung kemunculan huruf "A" dan pasangan huruf berurutan "A lalu C"
        dari sebuah Array dari ilustrasi berikut:
        dengan proses pengulangan dan pembacaan karakter 1 per 1 dari elemen array awal
        sampai selesai. Asumsi yang digunakan adalah elemen array pasti lebih dari 1 (Array
        tidak kosong)
         */


        Scanner scanner = new Scanner(System.in);
        // input string  dari pengguna.
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        // Buatlah array untuk menyimpan jumlah huruf 'A' dan pasangan huruf "AC" yang berurutan.
        int[] counts = new int[2];
        // Ulangi karakter dalam string, hitung kemunculan 'A' dan "AC".
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                counts[0]++;
            }
            if (i < str.length() - 1 && str.charAt(i) == 'A' && str.charAt(i + 1) == 'C') {
                counts[1]++;
            }
        }
        // Cetak hitungan 'A' dan "AC".
        System.out.println("The number of occurrences of 'A' is: " + counts[0]);
        System.out.println("The number of occurrences of 'AC' is: " + counts[1]);
    }
}