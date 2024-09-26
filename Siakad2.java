import java.util.Scanner;

public class Siakad2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, Kualifikasi = " ", NilaiHuruf = " ";
        String Kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        Kelas = input.nextLine();
        System.out.print("Masukkan Nomor Absen: ");
        absen = input.nextByte();

        System.out.println("-----Masukkan Komponen Nilai-----");
        System.out.print("Nilai Kuis: ");
        nilaiKuis = input.nextInt();
        System.out.print("Nilai Tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Nilai Ujian: ");
        nilaiUjian = input.nextInt();
        // System.out.print("Nilai UAS: ");
        // nilaiUAS = input.nextInt();

        nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUjian) / 3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            NilaiHuruf = "A";
            Kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 80 && nilaiAkhir < 73) {
            NilaiHuruf = "B+";
            Kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 65) {
            NilaiHuruf = "B";
            Kualifikasi = "Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 60) {
            NilaiHuruf = "C+";
            Kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 50) {
            NilaiHuruf = "C";
            Kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 39) {
            NilaiHuruf = "D";
            Kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            NilaiHuruf = "E";
            Kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim + " Kelas " + Kelas + " Absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " + NilaiHuruf);
        System.out.println("Kualifikasi: " + Kualifikasi);

    }
}
