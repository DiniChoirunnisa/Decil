/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Jawaban 1
    double alas,tinggi,luas;
    Scanner segitiga = new Scanner (System.in);
    System.out.println("program luas segitiga");
    System.out.print("alas : ");
    alas=segitiga.nextDouble();
    System.out.print("tinggi : ");
    tinggi=segitiga.nextDouble();
    luas =alas*tinggi/2;
    System.out.print("luas segitiga adalah " + luas);*/
    
    //Jawaban 2
    int alas,tinggi;
    double luas;
    Scanner segitiga = new Scanner (System.in);
    System.out.println("program luas segitiga");
    System.out.print("alas : ");
    alas=segitiga.nextInt();
    System.out.print("tinggi : ");
    tinggi=segitiga.nextInt();
    luas = (double) (alas*tinggi/2);
    System.out.print("luas segitiga adalah " + luas);
    } 
    
}
