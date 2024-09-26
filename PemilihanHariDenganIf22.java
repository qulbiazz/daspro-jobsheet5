import java.util.Scanner;

public class PemilihanHariDenganIf22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka: ");
        angka = input.nextInt();

        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka >= 6 && angka <= 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
