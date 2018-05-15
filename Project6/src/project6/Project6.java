/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Project6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //MENGECEK PROGRAM
        
        Scanner input = new Scanner (System.in);
        int a;
        
        System.out.print ("Masukkan angka: ");
      
        
        if (!input.hasNextInt())
        { //digunakan untuk mengecek apakah nilai yang dimasukan berupa integer
            System.out.print ("That's not a number!");
        } 
        else
        {
            a=input.nextInt();
            System.out.println ("number: "+a);
        }
    }
    
}
