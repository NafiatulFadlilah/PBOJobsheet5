/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan4;

/**
 *
 * @author Nafiaaeluv
 */
public class MainPercobaan4 {
    public static void main(String[] args){
        Penumpang p = new Penumpang("1234", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        Penumpang budi = new Penumpang("4567", "Budi");
        gerbong.setPenumpang(budi, 1); 
        System.out.println(gerbong.info());
    }
}