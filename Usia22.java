import java.util.Scanner;

class Usia22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;

        System.out.print("Masukkan Usia: ");
        usia = input.nextInt();

        if (usia > 0 && usia <= 12) {
            System.out.println("Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Dewasa");
        } else if (usia >= 65) {
            System.out.println("Lansia");
        } else {
            System.out.println("Usia Tidak Valid");
        }

    }
}