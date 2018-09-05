/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author WINDOWS 10
 */
public class InterfaceSegitiga implements InterfaceBangunDatar {
        private double tinggi;
        private double alas;
        
        public InterfaceSegitiga(double alas,double tinggi){
            this.tinggi=tinggi;
            this.alas=alas;
        }
        
        @Override
        public double hitungKeliling(){
            return 2*alas*tinggi;
        }
        
        @Override
        public double hitungLuas(){
            return ((alas*tinggi)/2);
        }
}
