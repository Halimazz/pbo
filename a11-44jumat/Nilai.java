public class Nilai {
    String nim;
    String nama;
    int nilaiTugas;
    int nilaiUts;
    int nilauUas;
    float total;

    void masukanNilai(String nim,String nama,
                        int nilaiTugas,
                        int nilaiUts,
                        int nilaiUas
                        ){
    this.nim=nim;
    this.nama=nama;
    this.nilaiTugas=nilaiTugas;
    this.nilaiUts=nilaiUts;
    this.nilauUas=nilaiUas;

    

                        }
    void tampilNilai(){
        System.out.println("NIM \t\t:"+this.nim);
        System.out.println("Nama \t\t:"+this.nama);
        System.out.println("Nilai tugas \t\t:"+this.nilaiTugas);
        System.out.println("Nilai UTS \t\t:"+this.nilaiUts);
        System.out.println("Nilai UAS \t\t:"+this.nilauUas);
       

    }
    void hitungNilai(){
        total =(this.nilaiTugas+this.nilaiUts+this.nilauUas)/3;
        System.out.println(total);
        System.out.println("====================================");
        if (total >= 80 ) {
            System.out.println("LULUS");
          }
          else if (total == 80) {
            System.out.println("Bagus");
          }
          else   {
            System.out.println("Perbanyak belajar");
          }
          
    }
}
