import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SATU_KB = 1024.0;
        // Menggunakan final agar nilai SATU_KB menjadi konstanta (nilai tetap) tidak akan berubah dalam perhitungan apapun
        // Menggunakan 1024.0 agar pembagian menghasilkan nilai desimal dan pecahannya tidak hilang.

        System.out.print("Masukkan Nama File: ");
        String nama_File = scanner.nextLine();

        //selama nama file tidak diakhiri .mp4, lakukan perulangan
        while (!nama_File.endsWith(".mp4")) {
            System.out.print("Nama file harus diakhiri dengan .mp4! Masukkan ulang: ");
            nama_File = scanner.nextLine();
        }
        // while menjalankan perulangan selama bernilai true
        //endswith. digunakan untuk mengecek apakah user mengakhiri kalimat sesuai yang kita inginkan

        System.out.print("Masukkan Ukuran File (byte): ");
        long ukuran_File = scanner.nextLong();
        //Exception in thread "main" java.util.InputMismatchException: For input string: "12345678901234567890"
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2273)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        //	at UkuranFile.main(UkuranFile.java:13)

        double kilo_Byte = ukuran_File / SATU_KB;
        double mega_Byte = ukuran_File / SATU_KB / SATU_KB;
        double giga_Byte = ukuran_File / SATU_KB / SATU_KB / SATU_KB;

        int mega_Byte_Bulat = (int) Math.round(mega_Byte);
        // Membulatkan nilai mega_Byte ke bilangan terdekat dan mengubah hasilnya dari long menjadi int.
        // untuk tipe data double perintah "Math.round" menghasilkan long, sehingga diperlukan (int) untuk memerintahkan
        // secara eksplisit bahwa kita ingin menyimpan hasil ke int
        double selisih = Math.abs(mega_Byte_Bulat - mega_Byte);
        // Menghitung selisih antara nilai MB yang sudah dibulatkan dengan nilai MB asli, lalu Math.abs() membuat hasil selisih selalu positif.

        System.out.println("==== UKURAN FILE ====");
        System.out.println("Nama File : " + nama_File);
        System.out.println("Ukuran KB : " + kilo_Byte);
        System.out.println("Ukuran MB : " + mega_Byte);
        System.out.println("Ukuran GB : " + giga_Byte);
        System.out.println("\nDibulatkan Ke MB : " + mega_Byte_Bulat);
        System.out.println("Selisih Pembulatan: " + selisih);

    }
}
