/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilai_latihan, nilai_uts, nilai_uas;
    double hasil;
    String nama;
    
    Scanner inputan = new Scanner (System.in);
    
    System.out.print ("masukkan nama anda : ");
    nama = inputan.nextLine();
    
    System.out.print ("masukkan nilai latihan : ");
    nilai_latihan=inputan.nextInt();
    
    System.out.print ("masukkan nilai UTS : ");
    nilai_uts=inputan.nextInt();
    
    System.out.print ("masukkan nilai UAS : ");
    nilai_uas=inputan.nextInt();
    
    hasil = (double) (0.2*nilai_latihan)+(0.3*nilai_uts)+(0.5*nilai_uas);
    
    System.out.print ("nilai yang diperoleh adalah " +hasil+ ". ");
    
    /*if (hasil>=70)
    {
        System.out.print ("Anda Hebat");
    }
    else
    {
        System.out.print ("Sayang sekali, belajar lebih giat ya");
    }*/
    
    
    if (hasil>80)
    {
        System.out.print ("Grade A");
    }
    else if (hasil>65)
    {
        System.out.print ("Grade B");
    }
    else if (hasil>50)
    {
        System.out.print ("Grade C");
    }
    else if (hasil<=50)
    {
        System.out.print ("Grade D");
    }
}
}