import java.util.Scanner;
public class Nomer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // untuk dapatkan nomor dari user.
        System.out.println("Masukkan nomor pertama:");
        int num1 = scanner.nextInt();
        System.out.println("Masukkan nomor kedua:");
        int num2 = scanner.nextInt();
        // Add the two numbers together.
        int sum = num1 + num2;
        // Print the result.
        System.out.println("Jumlah kedua bilangan tersebut adalah: " + sum);
    }
}