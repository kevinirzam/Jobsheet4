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
public abstract class Manusia {
    double TinggiBadan;
    
    public Manusia(double TinggiBadan){
        this.TinggiBadan=TinggiBadan;
    }
    
    double getTinggiBadan(){
        return TinggiBadan;//Getter
    }
    
    abstract double HtgBBI();
}
