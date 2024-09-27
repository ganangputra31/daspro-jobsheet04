import java.util.Scanner;

public class Siakad08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama ,Nim , kelas, nilaiHuruf = "",kualifikasi ="";
        int nomorAbsen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir,nilaiSetara;
         
        System.out.print("masukkan nama :");
        nama = sc.nextLine();
        System.out.print("masukkan Nim :");
        Nim = sc.nextLine();
        System.out.print("masukkan kelas :");
        kelas = sc.nextLine();
        System.out.print("masukkan nomor Absen :");
        nomorAbsen = sc.nextInt();
        System.out.print("masukkan nilai kuis :");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukkan nilai tugas :");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukkan nila ujian :");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) 
        {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir> 73 && nilaiAkhir <= 80)
        {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir> 65 && nilaiAkhir <= 73)
        {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir> 60 && nilaiAkhir <= 65)
        {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        }
        else if (nilaiAkhir> 50 && nilaiAkhir <= 60)
        {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir> 39 && nilaiAkhir <= 50)
        {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir >= 39)
        {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }
        else 
        {
            System.out.println("Nilai tidak valid");
        }

        System.out.println (" Mahasiswa dengan nama "  + nama + " Nim " + Nim + " kelas " + kelas +  " nomor Absen " + nomorAbsen);
        System.out.println("nilai Akhir :" + nilaiAkhir);
        System.out.println("Nilai Huruf :" + nilaiHuruf);
        System.out.println("kualifikasi :" + kualifikasi);

    }
}