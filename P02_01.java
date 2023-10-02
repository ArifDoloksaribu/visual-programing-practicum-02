// 12S23026-Arif M. Doloksaribuu
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String keterangan;
        int y;

        System.out.println("masukkan angka");
        y = input.nextInt();
        if (y > 3 && y <= 5) {
            keterangan = "Penting! Harus segera dikerjakan";
        } else {
            if (y <= 3 && y >= 1.5) {
                keterangan = " Tugas ini memiliki prioritas menengah";
            } else {
                if (y < 1.5) {
                    keterangan = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                } else {
                    keterangan = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(keterangan);
    }
}
