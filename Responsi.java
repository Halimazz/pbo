import java.util.Scanner;


public class Responsi {
    

    static void nasi(){
        System.out.println("01.Service Mesin");
        System.out.println("02.Service AC");
        System.out.println("03.Service Rem");
        System.out.println("04.Service Kelistrikan");
        System.out.println("05.Service Check Up");
        
            }    /**
             * @param args
             */
            public static void main(String[] args){
                int mesin = 150000;
                int ac    = 150000;
                int listrik = 150000;
                int rem = 150000;
                int checkUp= 1200000;
                int harga=0;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        String ulang="Y";
        int a=0,pilih =0;
        nasi();
        while (ulang.equals("Y")){
            System.out.println("Pilih Menu");
            pilih=sc.nextInt();
            if (pilih==1){
                System.out.println("Nama Service : Service Mesin");
                
                String sparePart[] = new String[5];
                int    hargapart[] = new int[5];
                for(int i=0;i<3;i++){
                    for(int j=0;j<hargapart.length;i++)
                sparePart[i] = sc1.nextLine();
                System.out.println("Nama Spare Part : ");
                }
                int total = harga + mesin;
                System.out.println("Harga :" + total);

            }
            else if (pilih==2){
                System.out.println("02.Service AC");
            }
            else if (pilih == 3){
                System.out.println("03.Service Rem");

            }
            else if (pilih == 4){
                System.out.println("04.Service Listrik");

            }
            else {
                     System.out.println("05.Service Check Up");


            }
            System.out.println("Pilih lagi? Y/N");
            ulang=sc.nextLine();
            if (ulang=="N"){
                break;
            }
            else{

            }


        }
    }
}
