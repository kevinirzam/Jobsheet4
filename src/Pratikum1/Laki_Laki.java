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
public class Laki_Laki extends Manusia{

    public Laki_Laki(double TinggiBadan) {
        super(TinggiBadan);
    }
    
    @Override
    double HtgBBI(){
        return ((TinggiBadan-100)-((TinggiBadan-100)*10/100));
    }
}
