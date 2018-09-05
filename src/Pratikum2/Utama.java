/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum2;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Invut = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        double bil1 = Invut.nextDouble();
        System.out.print("Masukkan bilangan kedua : ");
        double bil2 = Invut.nextDouble();
        System.out.println(" ");
        Operasi Outvut = new Kalkulator(bil1,bil2);
        System.out.println("Hasil Penjumlahan = "+Outvut.Penjumlahan());
        System.out.println("Hasil Pengurangan = "+Outvut.Pengurangan());
        System.out.println("Hasil Perkalian = "+Outvut.Perkalian());
        System.out.println("Hasil Pembagian = "+Outvut.Pembagian());
    }
    
}
