class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = "";
        this.tahun = 0;
    }


}
