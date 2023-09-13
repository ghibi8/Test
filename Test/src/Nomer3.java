public class Nomer3 {

    public static void main(String[] args) {
        /*
        No 3. Buatlah code program dengan Bahasa pemograman apa saja untuk menghasilkan
            output sebagai berikut:
            *
            **
            ***
            ****
            ***
            **
            *
            Syarat dan Ketentuan:
            Gunakan perulangan untuk menghasilkan output tersebut diatas baik secara vertical
            maupun horizontal.
         */

        // untuk vertikal
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // untuk horizontal
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}