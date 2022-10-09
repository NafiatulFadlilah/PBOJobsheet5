/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n.fadlilah.relasiclass.percobaan1;

/**
 *
 * @author Nafiaaeluv
 */
public class Processor {
    private String merk;
    private double cache;
    
    Processor(){ 
    }
    
    Processor(String m, double c){
        this.merk = m;
        this.cache = c;
    }
    
    public void setMerk(String m){
        this.merk = m;
    }
    
    public String getMerk(){
        return merk;
    }
    
    void setCache(double c){
        this.cache = c;
    }
    
    public double getCache(){
        return cache;
    }
    
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache memory = %.2f\n", cache);
    }
}