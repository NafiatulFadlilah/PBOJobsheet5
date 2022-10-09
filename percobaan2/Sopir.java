/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan2;

/**
 *
 * @author Nafiaaeluv
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir(){
    }
    
    public void setNama(String n){
        this.nama = n;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setBiaya(int b){
        this.biaya = b;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}