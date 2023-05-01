public class KaryawanKontrak extends Karyawan {
    public static void main(String[] args){
        KaryawanKontrak karyawan = new KaryawanKontrak("Budi", 3, 100000, 30);
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jumlah Anak: " + karyawan.getJumlahAnak());
        System.out.println("Tunjangan Anak: " + karyawan.getTunjanganAnak());
        System.out.println("Gaji Harian: " + karyawan.getGajiharian());
        System.out.println("Gaji: " + karyawan.hitungGaji());
    }
    private double gajiHarian;
    private int jumlahHari;

    public KaryawanKontrak(String nama, int jumlahAnak, double gajiHarian, int jumlahHari) {
        super(nama, jumlahAnak);
        this.gajiHarian = gajiHarian;
        this.jumlahHari = jumlahHari;
    }

    public double getGajiharian() {
        return gajiHarian;
    }

    @Override
    public double hitungGaji(){
        return getGajiharian() * jumlahHari + getTunjanganAnak();
    }

    
}
