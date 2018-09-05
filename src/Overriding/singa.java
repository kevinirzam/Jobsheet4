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
public class singa extends hewan{
    
    //Subclass
    //Method Default
    @Override
    void setNama(){
        String singa = "Pablo";
        System.out.println("Nama Singa: "+singa);
    }
    @Override
    void setSuara(){
        String suara = "Iccccikkk kiwir";
        System.out.println("Suara Singa: "+suara);
    }
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println("Berat Singa: "+berat+" Kg");
    }
}
