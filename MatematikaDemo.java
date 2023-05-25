
public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        int sum = mtk.tambah(5, 10);
        System.out.println("Hasil pertambahan: " + sum); // Output: Hasil pertambahan: 15
        
        double sumDouble = mtk.tambah(2.5, 3.7, 1.2);
        System.out.println("Hasil pertambahan (double): " + sumDouble); // Output: Hasil pertambahan (double): 7.4
        
        int difference = mtk.kurang(15, 7);
        System.out.println("Hasil pengurangan: " + difference); // Output: Hasil pengurangan: 8
        
        double differenceDouble = mtk.kurang(10.5, 3.2, 1.1);
        System.out.println("Hasil pengurangan (double): " + differenceDouble); // Output: Hasil pengurangan (double): 6.2
        
        int product = mtk.kali(4, 6);
        System.out.println("Hasil perkalian: " + product); // Output: Hasil perkalian: 24
        
        double productDouble = mtk.kali(2.5, 1.5, 0.5);
        System.out.println("Hasil perkalian (double): " + productDouble); // Output: Hasil perkalian (double): 1.875
        
        int quotient = mtk.bagi(20, 4);
        System.out.println("Hasil pembagian: " + quotient); // Output: Hasil pembagian: 5
        
        double quotientDouble = mtk.bagi(12.0, 2.0, 1.5);
        System.out.println("Hasil pembagian (double): " + quotientDouble); // Output: Hasil pembagian (double): 4.0
    
    }
} 
