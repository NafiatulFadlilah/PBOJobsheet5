/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan2;

/**
 *
 * @author Nafiaaeluv
 */
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil(){
    }
    
    public void setMerk(String m){
        this.merk = m;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setBiaya(int b){
        this.biaya = b;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}