

public class PesawatTempur extends Pesawat{

    
    public void namapesawat(String nama){
        System.out.println("Nama pesawat: "+nama);
    }
    public void manuver(){
        System.out.println("Pesawat tempur manuver ala tempur");
    }
    @Override
    public void terbang(){
        System.out.println("Pesawat tempur terbang");
    }
    public void mendarat(){
        System.out.println("Pesawat Tempur Mendarat ");

    }
    
}
