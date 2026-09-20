import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SATU_KB = 1024.0;
        // Menggunakan final agar nilai SATU_KB menjadi konstanta (nilai tetap) tidak akan berubah dalam perhitungan apapun
        // Menggunakan 1024.0 agar pembagian menghasilkan nilai desimal dan pecahannya tidak hilang.

        System.out.print("Masukkan Nama File: ");
        String nama_File = scanner.nextLine();

        System.out.println("Masukkan Ukuran File: ");
        long ukuran_File = scanner.nextLong();
        //Exception in thread "main" java.util.InputMismatchException: For input string: "12345678901234567890"
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2273)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        //	at UkuranFile.main(UkuranFile.java:13)

        double kilo_Byte = ukuran_File / SATU_KB;
        double mega_Byte = ukuran_File / SATU_KB / SATU_KB;
        double giga_Byte = ukuran_File / SATU_KB / SATU_KB / SATU_KB;

        System.out.println("==== UKURAN FILE ====");
        System.out.println(nama_File);
        System.out.println(kilo_Byte);
        System.out.println(mega_Byte);
        System.out.println(giga_Byte);

    }
}
