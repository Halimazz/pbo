/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author D2A
 */
public class SuhuTest {
    public static void main(String[] args){
    float celcius;
    Scanner sc= new Scanner(System.in);
    Suhu cnvrt =new Suhu();
    celcius=sc.nextFloat();
    System.out.println(""+celcius+"derajat celcius\t:");
    System.out.println(""+celcius+"C"+cnvrt.toKelvin(celcius)+"Kelvin");
    System.out.println(""+celcius+"C"+cnvrt.toFarenheit((int) celcius)+"farenheit");
    
    
    
    
    
    
    
    
    }
    
    
}
