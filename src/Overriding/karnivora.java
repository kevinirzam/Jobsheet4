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
public class karnivora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CARA PENULISAN OBJEK: (sUPERCLASS) VARIABLE = NEW (SUBCLASS)
        System.out.println("=======Hewan Default=======");
        hewan b = new hewan();
        b.setNama();
        b.setSuara();
        b.setBerat();
        
        System.out.println("=======Hewan Singa=======");
        singa c = new singa();
        c.setNama();
        c.setSuara();
        c.setBerat();
        
        System.out.println("=======Hewan Kucing=======");
        kucing d = new kucing();
        d.setNama();
        d.setSuara();
        d.setBerat();
    }
    
}
