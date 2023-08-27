
/**
 *
 * @author Azis
 */
import java.util.Scanner;

public class SortNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner masukan = new Scanner(System.in)) {
            System.out.println("====== Mengurutkan Nama Sesuai Alfabet ======");
            int jumlahdata;
            System.out.print("Masukan Jumlah Nama : ");
            jumlahdata = masukan.nextInt();

            // input nama
            String[] nama = new String[jumlahdata];

            // mendeklarasikan variabel array untuk menyimpan data
            for (int a = 0; a < jumlahdata; a++) {
                System.out.print("Nama ke- " + (a + 1) + " : ");
                nama[a] = masukan.next();
            }
            System.out.println();

            // menampilkan data sebelum diurutkan
            System.out.println("Data Sebelum Diurutkan : ");
            for (int a = 0; a < jumlahdata; a++)
                System.out.println(nama[a] + " ");

            // proses pengurutan data
            System.out.println();
            System.out.println("Proses Pengurutan Data");
            for (int a = 0; a < nama.length - 1; a++) {
                // menampilkan proses
                System.out.println("Proses ke- " + (a + 1) + " : ");
                for (int b = 0; b < nama.length - 1; b++) {
                    if (nama[b].compareTo(nama[b + 1]) > 0) {
                        // proses pertukaran
                        String temp = nama[b];

                        nama[b] = nama[b + 1];
                        nama[b + 1] = temp;
                    }
                    if (b < nama.length - (a + b)) {
                        for (int c = 0; c < nama.length; c++)
                            System.out.println(nama[c] + " ");
                        System.out.println();

                    }
                }
                System.out.println(" ");
            }
            // menampilkan data setelah di urutkan
            System.out.println("Data Setelah Diurutkan : ");
            for (int a = 0; a < nama.length; a++)
                System.out.println(nama[a] + " ");
        }
    }

}
