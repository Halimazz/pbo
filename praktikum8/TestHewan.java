import java.util.Scanner;
public class TestHewan {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        singa singa = new singa();
        elang elang = new elang();
        lebah lebah = new lebah();
        paus paus = new paus();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Pilihan");
        int pilihan = input.nextInt(); // Ganti dengan pilihan yang diinginkan

        switch (pilihan) {
            case 1:
                singa.suara("roar");
                singa.berjalan("berlari");
                break;
            case 2:
                elang.suara(" miiip");
                elang.berjalan("terbang");
                break;
            case 3:
                lebah.suara("zzzzzz");
                lebah.berjalan("terbang");
                break;
            case 4:
                paus.suara("zzzzzz");
                paus.berjalan("berenang");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
