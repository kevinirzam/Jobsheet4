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
public class InterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar sisi 10 : "+obyek1.hitungLuas());
        System.out.println("Kelilingnya : "+obyek1.hitungKeliling());
        
        InterfaceSegitiga obyek2 = new InterfaceSegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6 dan tinggi 8 : "+obyek2.hitungLuas());
        System.out.println("Kelilingnya : "+obyek2.hitungKeliling());
        
        
    }
    
}
