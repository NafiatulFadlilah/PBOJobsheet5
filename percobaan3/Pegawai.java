/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan3;

/**
 *
 * @author Nafiaaeluv
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String ni){
        this.nip = ni;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String na){
        this.nama = na;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "NIP: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}