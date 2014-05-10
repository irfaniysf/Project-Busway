/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIFIX.Model;

import busway.Koneksi;

/**
 *
 * @author Irfani Yusuf
 */
public class Busways {
    private String platNomer ; 
    private String rute ; 
    private int tarif ; 
    private String supir ;

    public Busways() {
    }
    
    public Busways(String platNomer, String rute, int tarif, String supir) {
        this.platNomer = platNomer;
        this.rute = rute;
        this.tarif = tarif;
        this.supir = supir;
    }

    public String getPlatNomer() {
        return platNomer;
    }

    public String getRute() {
        return rute;
    }

    public int getTarif() {
        return tarif;
    }

    public String getSupir() {
        return supir;
    }

    public void setPlatNomer(String platNomer) {
        this.platNomer = platNomer;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public void setSupir(String supir) {
        this.supir = supir;
    }
    
      public void SimpanBusway(){
        Koneksi kon = new Koneksi();
        String s = "insert into busway values('"+this.platNomer+"','"+this.rute+"','"+this.tarif+"','"+this.supir+"')";
        kon.query(s);
    }
    public void hapusBusway(){
      Koneksi kon = new Koneksi();
         String s = "delete from busway where platNomer='"+platNomer+"'";
       kon.query(s);
    }
    public void UpdateMahasiswa(String NIM) {
        Koneksi konn = new Koneksi();
        String s = "update busway set platNomer ='"+ this.platNomer + "', rute ='" + this.rute + "' , tarif ='" + this.tarif + "', supir ='" + this.supir + "' where platNomer = '" + platNomer + "'";
        konn.query(s);
    }
    
    
}
