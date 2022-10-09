/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan1;

/**
 *
 * @author Nafiaaeluv
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
    }
    
    Laptop(String m, Processor p){
        this.merk = m;
        this.proc = p;
    }
    
    public void setMerk(String m){
        this.merk = m;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setProc(Processor p){
        this.proc = p;
    }
    
    public Processor getProc(){
        return proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}