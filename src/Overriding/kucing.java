/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author WINDOWS 10
 */
public class kucing extends hewan{
    @Override
    void setNama(){
        String kucing = "Carberus";
        System.out.println("Nama Kucing: "+kucing);
    }
    
    @Override
    void setSuara(){
        String suara = " Meong Meong ";
        System.out.println("Suara Kucing : "+suara);
    }
    
    @Override 
    void setBerat(){
        String berat ="2.0";
        System.out.println("Berat Kucing : "+berat+" Kg");
    }
}
