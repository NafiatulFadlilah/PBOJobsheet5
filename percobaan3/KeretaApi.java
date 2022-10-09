/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan3;

/**
 *
 * @author Nafiaaeluv
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi(String n, String k, Pegawai m){
        this.nama = n;
        this.kelas = k;
        this.masinis = m;
    }
    
    KeretaApi(String n, String k, Pegawai m, Pegawai a){
        this.nama = n;
        this.kelas = k;
        this.masinis = m;
        this.asisten = a;
    }
    
    public void setNama(String n){
        this.nama = n;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setKelas(String k){
        this.kelas = k;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setMasinis(Pegawai m){
        this.masinis = m;
    }
    
    public Pegawai getMasinis(){
        return masinis;
    }
    
    public void setAsisten(Pegawai a){
        this.asisten = a;
    }
    
    public Pegawai getAsisten(){
        return asisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        //perbaikan class KeretaApi (Asisten)
        if(this.asisten != null){
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
}