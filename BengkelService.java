import java.util.Scanner;

public class BengkelService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        double totalHarga = 0;
        
        while (pilihan != 6) {
            System.out.println("Pilihan Bengkel:");
            System.out.println("1. Service Mesin");
            System.out.println("2. Service AC");
            System.out.println("3. Service Kelistrikan");
            System.out.println("4. Service Pengereman");
            System.out.println("5. Service Check UP");
            System.out.println("6. Exit");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Apakah ada penambahan sparepart lain? (y/n) ");
                    String jawaban = input.next();
                    if (jawaban.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan nama sparepart: ");
                        String namaSparepart = input.next();
                        System.out.print("Masukkan harga sparepart: ");
                        double hargaSparepart = input.nextDouble();
                        totalHarga += 150000 + hargaSparepart;
                    } else {
                        totalHarga += 150000;
                    }
                    System.out.println("Biaya service: " + totalHarga);
                    break;

                case 5:
                    totalHarga = 1200000;
                    System.out.println("Biaya service: " + totalHarga);
                    break;

                case 6:
                    System.out.println("Keluar Program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }
}
