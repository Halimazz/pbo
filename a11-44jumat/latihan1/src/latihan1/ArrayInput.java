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
public class ArrayInput{
     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
     String nim[] =new String [5];
     String nama[] =new String [5];
     for(int i=0;i<3;i++){
     System.out.println("Masukan Nim :");
     nim[i]=sc.nextLine();
     System.out.println("Masukan Nama:");
     nama[i]=sc.nextLine();
        }
     }
     
    /**
     *
     * @param nim
     * @param nama
     */
    public static void tampilkan(String[] nim, String[] nama){
         System.out.println("======================");
         System.out.println("NIM\tNama");
         System.out.println("======================");
      
         for (int t=0;t<3;t++){
         System.out.println(""+nim[t]+"\t"+nama[t]);
         }
     }
     
     
    }
    
