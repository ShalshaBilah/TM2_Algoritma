import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Mengurutkan Nama Sesuai Alfabet ");

        int jumlahdata;
        System.out.println("Masukkan Jumlah Data :");
        jumlahdata = masukkan.nextInt();

        String[] nama = new String[jumlahdata];
        String temp;
        for (int a = 0; a < jumlahdata; a++) {
            System.out.println("Nama ke - " + (a + 1) + " : ");
            nama[a] = masukkan.next();
        }
        System.out.println();

        for (int j = 0; j < nama.length; j++) {
            for (int i = j + 1; i < nama.length; i++) {
                if (nama[i].compareTo(nama[j]) < 0) {
                    temp = nama[j];
                    nama[j] = nama[i];
                    nama[i] = temp;
                }
            }
            System.out.println(nama[j]);
        }
    }
}
// TM2_21090085_RafidatusSalsabilah_2A
