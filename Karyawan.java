public class Karyawan {
    private String nama;
    private int jumlahAnak;
    private double tunjanganAnak;

    public Karyawan(String nama, int jumlahAnak) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
        this.tunjanganAnak = 1000000 * jumlahAnak;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double hitungGaji() {
        return 0;
    }
}
