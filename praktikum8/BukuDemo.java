class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Java Programming", "John Doe", "Publisher A", 2022);

        Buku buku2 = new Buku("Python Basics", "Jane Smith");

        System.out.println("Informasi Buku 1:");
        System.out.println("Judul: " + buku1.judul);
        System.out.println("Pengarang: " + buku1.pengarang);
        System.out.println("Penerbit: " + buku1.penerbit);
        System.out.println("Tahun: " + buku1.tahun);

        System.out.println("\nInformasi Buku 2:");
        System.out.println("Judul: " + buku2.judul);
        System.out.println("Pengarang: " + buku2.pengarang);
        System.out.println("Penerbit: " + buku2.penerbit);
        System.out.println("Tahun: " + buku2.tahun);
        }
    }