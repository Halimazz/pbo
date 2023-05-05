import java.util.Scanner;

public class uts_halimAlAziz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);
        Scanner input8 = new Scanner(System.in);
        Scanner input9 = new Scanner(System.in);
        Scanner input10 = new Scanner(System.in);
        Scanner input11 = new Scanner(System.in);
        Scanner input12 = new Scanner(System.in);


        int pilihan = 0;

        double totalHarga = 0;
                    int harga_tiket_kelasKapalEkonomi =0;
                    int harga_tiket_kelaskapalVIP=0 ;
                    int harga_tiket_kelasPesawatVIP=0;
                    int harga_tiket_kelasPesawatEkonomi=0;
                int harga_tiket_kelasKeretaVIP=0;
                int harga_tiket_kelasKeretaEkonomi=0;



        while(pilihan !=5){
            System.out.println(" Menu Penjualan Tiket");
            System.out.println("1. Pesaat");
            System.out.println("2. Kapal Laut");
            System.out.println("3. kereta Api");
            System.out.println("4. Hitung Biaya");
            System.out.println("5. Keluar");
            System.out.println("Masukan Identitas Anda!");
                System.out.println("Nama :"); 
                String nama = input.next();
                System.out.println("Gender :");
                String jenisKelamin = input2.next();
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                int pilih_kelasPesawat=0;
                System.out.println("Menu Kelas");
                System.out.println("1.VIP");
                System.out.println("2.Ekonomi");
                System.out.println("pilih kelas :");
                pilih_kelasPesawat = input3.nextInt();
                switch(pilih_kelasPesawat){
                    case 1:
                 int pilih_kelasPesawatVIP=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 60000");
                System.out.println("2.Semarang-Jakarta : 75000");
                System.out.println("3.Semarang-Bandung : 95000");
                pilih_kelasPesawatVIP = input8.nextInt();
                switch(pilih_kelasPesawatVIP){
                    case 1:
                    harga_tiket_kelasPesawatVIP = 60000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatVIP);
                    break;
                    case 2:
                    harga_tiket_kelasPesawatVIP = 75000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatVIP);
                    break;
                    case 3:
                    harga_tiket_kelasPesawatVIP = 95000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatVIP);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    return;
                    
                }
                    case 2:
                
                 int pilih_kelasPesawatEkonomi=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 450000");
                System.out.println("1.Semarang-Jakarta :490000");
                System.out.println("1.Semarang-Bandung : 650000");
                pilih_kelasPesawatEkonomi = input9.nextInt();
                switch(pilih_kelasPesawatEkonomi){
                    case 1:
                    harga_tiket_kelasPesawatEkonomi = 450000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatEkonomi);
                    break;
                    case 2:
                    harga_tiket_kelasPesawatEkonomi =490000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatEkonomi);
                    break;
                    case 3:
                    harga_tiket_kelasPesawatEkonomi = 650000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasPesawatEkonomi);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
                    
                }

                
            }

                case 2:
                int pilih_kelasKereta=0;
                System.out.println("Menu Kelas");
                System.out.println("1.VIP");
                System.out.println("2.Ekonomi");
                System.out.println("pilih kelas :");
                pilih_kelasKereta = input5.nextInt();
                switch(pilih_kelasKereta){
                    case 1:
                 int pilih_kelasKeretaVIP=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 60000");
                System.out.println("1.Semarang-Jakarta : 75000");
                System.out.println("1.Semarang-Bandung : 95000");
                pilih_kelasKeretaVIP = input9.nextInt();
                switch(pilih_kelasKeretaVIP){
                    case 1:
                    harga_tiket_kelasKeretaVIP = 60000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaVIP);
                    break;
                    case 2:
                    harga_tiket_kelasKeretaVIP = 75000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaVIP);
                    break;
                    case 3:
                    harga_tiket_kelasKeretaVIP = 95000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaVIP);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
                    
                }
                    case 2:
                 int pilih_kelasKeretaEkonomi=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 450000");
                System.out.println("1.Semarang-Jakarta :490000");
                System.out.println("1.Semarang-Bandung : 650000");
                pilih_kelasKeretaEkonomi = input10.nextInt();
                switch(pilih_kelasKeretaEkonomi){
                    case 1:
                    harga_tiket_kelasKeretaEkonomi = 450000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaEkonomi);
                    break;
                    case 2:
                    harga_tiket_kelasKeretaEkonomi =490000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaEkonomi);
                    break;
                    case 3:
                    harga_tiket_kelasKeretaEkonomi = 650000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKeretaEkonomi);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
                    
                }

                
            }
            
                case 3:
                int pilih_kelasKapal=0;
                System.out.println("Menu Kelas");
                System.out.println("1.VIP");
                System.out.println("2.Ekonomi");
                System.out.println("pilih kelas :");
                pilih_kelasKapal = input4.nextInt();
                switch(pilih_kelasKapal){
                    case 1:
                 int pilih_kelasKapalVIP=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 60000");
                System.out.println("2.Semarang-Jakarta : 75000");
                System.out.println("3.Semarang-Bandung : 95000");
                pilih_kelasKapalVIP = input11.nextInt();
                switch(pilih_kelasKapalVIP){
                    case 1:
                    harga_tiket_kelaskapalVIP = 60000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelaskapalVIP);
                    break;
                    case 2:
                    harga_tiket_kelaskapalVIP = 75000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelaskapalVIP);
                    break;
                    case 3:
                    harga_tiket_kelaskapalVIP = 95000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelaskapalVIP);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
                    
                }
                    case 2:
                
                 int pilih_kelasKapalEkonomi=0;
                System.out.println("Harga");
                System.out.println("1.Semarang-Surabaya : 450000");
                System.out.println("1.Semarang-Jakarta :490000");
                System.out.println("1.Semarang-Bandung : 650000");
                pilih_kelasKapalEkonomi = input12.nextInt();
                switch(pilih_kelasKapalEkonomi){
                    case 1:
                    harga_tiket_kelasKapalEkonomi = 450000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKapalEkonomi);
                    break;
                    case 2:
                    harga_tiket_kelasKapalEkonomi =490000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKapalEkonomi);
                    break;
                    case 3:
                    harga_tiket_kelasKapalEkonomi = 650000;
                    System.out.println("Harga Tiket :"+harga_tiket_kelasKapalEkonomi);
                    break;
                    default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
                    
                }

                
            }
                case 4:
                int total_biaya=0;
                System.out.println(nama);
                System.out.println(jenisKelamin);
                total_biaya=harga_tiket_kelasKapalEkonomi+harga_tiket_kelaskapalVIP+harga_tiket_kelasKeretaEkonomi+harga_tiket_kelasKeretaVIP+harga_tiket_kelasPesawatEkonomi+harga_tiket_kelasPesawatVIP;
                System.out.println("Jadi Total Biaya Yang Harus Anda Bayar Adalah");
                System.out.println(total_biaya);
                break;

        }

    }
    
    }
}
