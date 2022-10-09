/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan2;

/**
 *
 * @author Nafiaaeluv
 */
public class Pelanggan {
    Pelanggan(){
    }
    
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public void setNama(String n){
        this.nama = n;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setMobil(Mobil m){
        this.mobil = m;
    }
    
    public Mobil getMobil(){
        return mobil;
    }
    
    public void setSopir(Sopir s){
        this.sopir = s;
    }
    
    public Sopir getSopir(){
        return sopir;
    }
    
    public void setHari(int h){
        this.hari = h;
    }
    
    public int getHari(){
        return hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}