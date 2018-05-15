/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //MEMBUAT POSITION AND ANIMATION (GAMBAR BINTANG)
    
    //contoh 1
    
    for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
        System.out.print ("*");
        }
        System.out.println();
        }
    
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    
    //contoh2
    for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if (i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
        }
        System.out.println();
        }
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    
    //contoh3
    
    int n;
    
    Scanner input= new Scanner (System.in);
    
    System.out.print ("Masukkan panjang/lebar kotak: ");
    if (!input.hasNextInt())
        {
            System.out.print ("Harus angka! Tidak bisa di proses");
        } 
        else
        {
          n=input.nextInt();
          for (int i=1;i<=n;i++)
          {
            for (int j=1;j<=n;j++)
            {
                if (i==1 || i==n || j==1 || j==n)
                {
                    System.out.print ("*");
                }
                else {
                    System.out.print (" ");
                }
        }
        System.out.println();
        }
    
    
    
    }
    
    }
}
    

