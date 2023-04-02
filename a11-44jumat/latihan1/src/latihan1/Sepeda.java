/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author D2A
 */
public class Sepeda{
    int kepatan;
    int gigi;
    
    public void tambahKecepatan(int kecepatan){
        this.kepatan =this.kepatan+kecepatan;
        System.out.println("Kecepatan Sekarang\t:"+this.kepatan);
        
        
    
    }
    public void gantiGigi(int pGigi){
        this.gigi= this.gigi+pGigi;
         System.out.println("posisi gigi sekarang\t:"+this.gigi);



}
    
}
