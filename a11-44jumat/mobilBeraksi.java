public class mobilBeraksi {
     public static void main(String[] args){
        mobil xenia=new mobil();

        
        xenia.HidupkanMesin();
        xenia.Maju();
        xenia.Belok();
        xenia.Mundur();

        xenia.tahunProduksi=2020;
        xenia.warnaMobil="kuning";
        xenia.jenisMobil="MPV";
        System.out.println("Nama Mobil Xenia");
        System.out.println("Jenis Mobil\t\t:"+xenia.jenisMobil);
        System.out.println("Warna Mobil\t\t:"+xenia.warnaMobil);
        System.out.println("Tahun produksi Mobil\t\t:"+xenia.tahunProduksi);

     }
}
