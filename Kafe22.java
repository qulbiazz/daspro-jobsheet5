import java.util.Scanner;

public class Kafe22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        double hargamenu = 0;

        System.out.print("Masukkan Menu: ");
        menu = input.nextLine();
        System.out.print("Masukkan Jumlah: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan Ukuran Cup: ");
        ukuranCup = input.next().charAt(0);
        System.out.print("Masukkan Keanggotan (true/false): ");
        keanggotaan = input.nextBoolean();

        switch (menu.toLowerCase()) {
            case "Kopi":
                hargamenu = 12000;
                break;
            case "teh":
                hargamenu = 7000;
                break;
            case "coklat":
                hargamenu = 20000;
                break;
        }
        double totalHarga = hargamenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("size yang dipilih tidak tersedia");
                return;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item Pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar: " + nominalBayar);
    }
}