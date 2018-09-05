/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

    import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        do{
        Scanner Inp = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("User "+(x+1));
        System.out.print("Masukkan tinggi badan anda (cm) = ");
        double Use1 = Inp.nextDouble();
        Manusia obj1 = new Laki_Laki(Use1);
        Manusia obj2 = new Perempuan(Use1);
        
        System.out.print("Masukkan jenis kelamin anda (L/P) = ");
        String LP1 = Inp.next();

        
        switch(LP1){
            case "L": System.out.println("Berat badan ideal laki-laki ini adalah "+obj1.HtgBBI());
            break;
            case "P": System.out.println("Berat badan ideal perempuan ini adalah "+obj2.HtgBBI());
            break;
            case "l": System.out.println("Berat badan ideal laki-laki ini adalah "+obj1.HtgBBI());
            break;
            case "p": System.out.println("Berat badan ideal perempuan ini adalah "+obj2.HtgBBI());
            }x++;}while(x<2);
    }
    
}
