/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan4;

/**
 *
 * @author Nafiaaeluv
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomor){
        for(int i = 0; i < arrayKursi.length; i++){
            Kursi k = arrayKursi[i];
            if(Integer.parseInt(k.getNomor()) == nomor && k.getPenumpang() != null){
                System.out.println("Maaf, kursi dengan nomor " + nomor + " sudah dipakai penumpang lain.\n");
                break;
            }else{
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            }
        }        
    }
    
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    
    public String info(){
        String info = "";
        info += "Kode: " + kode + "\n";
        for(Kursi kursi: arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}