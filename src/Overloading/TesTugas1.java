/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author WINDOWS 10
 */
public class TesTugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RerataNilai rn = new RerataNilai();
        System.out.println("Rerata Nilai 21 dan 13 : "+rn.average(21,13));
        System.out.println("Rerata Nilai 19.3 dan 39.5 : "+rn.average(19.3,39.5));
        System.out.println("Rerata Nilai 123,567 dan 744 : "+rn.average(123,567,744));
        
    }
    
}
