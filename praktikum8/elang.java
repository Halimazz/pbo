
public class elang extends Hewan{
    String jenis;
    String ciri;
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setCiri(String ciri) {
        this.ciri = ciri;
    }
    public void suara(String suara){
        System.out.println("elang bersuara"+suara);
    }
    public void berjalan(String berjalan){
        System.out.println("elang"+berjalan);
    }
    
}
