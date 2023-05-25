

public class TestPesawat {
  public static void main(String[] args) {
    Pesawat pesawatku = new Pesawat();
    PesawatTempur pesawatku2 = new PesawatTempur();
    pesawatku.terbang();
    pesawatku.mendarat();
    pesawatku2.namapesawat("bomber");
    pesawatku2.terbang();
    pesawatku2.mendarat();
    pesawatku2.manuver();

  }  
}
