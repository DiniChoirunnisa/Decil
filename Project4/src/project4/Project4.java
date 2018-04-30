/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int angka;
    
    Scanner input= new Scanner (System.in);
    
    System.out.println ("program membedakan angka ganjil dan genap");
    
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    
    if (angka%2==0)
    {
        System.out.print ("ini adalah bilangan genap");
    }
    else
    {
        System.out.print ("ini adalah bilangan ganjil");
    }
    }
    
    }
