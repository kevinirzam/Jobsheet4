/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

/**
 *
 * @author WINDOWS 10
 */
final class Perempuan extends Manusia{
    public Perempuan(double TinggiBadan){
        super(TinggiBadan);
    }
    
    final double HtgBBI(){
        return ((TinggiBadan-100)-((TinggiBadan-100)*20/100));
    }
}
