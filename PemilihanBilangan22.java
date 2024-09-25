import java.util.Scanner;

class PemilihamBilangan22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan;
        String hasil;

        System.out.print("Masukkkan Bilangan: ");
        bilangan = sc.nextInt();

        hasil = (bilangan % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka: " + bilangan + " adalah "+hasil);
    }
}