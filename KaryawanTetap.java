
public class KaryawanTetap extends Karyawan {
    public static void main(String[] args) {
        KaryawanTetap karyawan = new KaryawanTetap("Budi", 2, 5000000);
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jumlah Anak: " + karyawan.getJumlahAnak());
        System.out.println("Tunjangan Anak: " + karyawan.getTunjanganAnak());
        System.out.println("Gaji Pokok: " + karyawan.getGajiPokok());
        System.out.println("Gaji: " + karyawan.hitungGaji());
    }
    private double gajiPokok;

    public KaryawanTetap(String nama, int jumlahAnak, double gajiPokok) {
        super(nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + getTunjanganAnak();
    }
}

