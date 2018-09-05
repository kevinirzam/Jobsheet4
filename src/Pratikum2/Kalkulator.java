/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum2;

/**
 *
 * @author WINDOWS 10
 */
public class Kalkulator implements Operasi{
    public double Bil1,Bil2;
    public Kalkulator(){}; 
    
    public Kalkulator(double Bil1,double Bil2){
    this.Bil1=Bil1;
    this.Bil2=Bil2;}; 
    
    double getBil1(){
        return Bil1;
    }
    
    double getBil2(){
        return Bil2;
    }
    
    @Override
    public double Penjumlahan(){
        return Bil1+Bil2;
    }
    @Override
    public double Pengurangan(){
        return Bil1-Bil2;
    }
    @Override
    public double Perkalian(){
        return Bil1*Bil2;
    }
    @Override
    public double Pembagian(){
        return Bil1/Bil2;
    }
}
