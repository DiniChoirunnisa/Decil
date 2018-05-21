/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project15;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class segitiga{
        double alas;
        double tinggi;
        
//contructor
public segitiga(){
    alas=0.0;
    tinggi=0.0;
}

//Procedure input
public void input (){
    Scanner input = new Scanner (System.in);
    System.out.println ("Perhitungan Segitiga");
    System.out.print ("Masukkan alas segitiga: ");
    alas=input.nextDouble();
    System.out.print ("Masukkan tinggi segitiga: ");
    tinggi=input.nextDouble();
}

//Function luas
public double luas(){
    return (alas*tinggi/2);
}

//Procedure output
public void output(){
    System.out.println ("Luas Segitiga: "+luas());
}
}

//Program utama
public class Project15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        segitiga sp= new segitiga ();
        sp.input();
        sp.output();
    }
    
}


