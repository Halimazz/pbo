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
public class Menu01 {
     static void nasi(){
System.out.println("NASI RAMES");
System.out.println("NASI GUDEG");
System.out.println("NASI GORENG");
System.out.println("NASI PINDANG");

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ulang="Y";
        int a=0,pilih =0;
        nasi();
        while (ulang.equals("Y")){
            System.out.println("Pilih Menu");
            pilih=sc.nextInt();
            if (pilih==1){
                System.out.println("NASI RAMES");
            }
            else if (pilih==2){
                System.out.println("NASI RAMES");
            }
            else{
                System.out.println("NASI PINDANG");
            }
            System.out.println("Pilih lagi? Y/N");
            ulang=sc.nextLine();
            if (ulang=="N"){
                break;
            }


        }
    }
    
}
