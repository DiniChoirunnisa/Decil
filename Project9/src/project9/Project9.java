/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Deklarasi array2
    //int nilai_ar[];
   
    int nilai = 0;
    
    Scanner input= new Scanner (System.in);
    
    System.out.println ("input nilai 3 buah ");
    
    int nilai_ar[];
    System.out.print ("Masukkan jumlah array : ");
    int x=input.nextInt();
    //menentukan jumlah slot pada array
    nilai_ar=new int [x];

    for (int i=0;i<x;i++)
    {
        System.out.print ("Masukkan nilai ke-"+i+ " : ");
        nilai_ar[i]=input.nextInt();   
    }
    System.out.print ("Banyaknya data "+nilai_ar.length);
    
    System.out.print ("Rangking array ");
    Arrays.sort(nilai_ar);
     for (int i=0;i<x;i++)
         System.out.print ("Rank "+i+" : "+nilai_ar[i]);
    //Sort digunakan untuk mengurutkan nilai
    }
    }
    

