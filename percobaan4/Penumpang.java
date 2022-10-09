/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan4;

/**
 *
 * @author Nafiaaeluv
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "KTP: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}