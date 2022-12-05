/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_01;

/**
 *
 * @author infin
 */
public class Dangdut {
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }
    void singer(String penyanyi){
        this.penyanyi=penyanyi;
    }
    public void song(String lagu, String lagu2){
        this.lagu = lagu;
    }
    void cetakLabel(){
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }
}
