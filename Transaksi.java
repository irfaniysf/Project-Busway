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
public class Transaksi {
    private String Tanggal ; 
    private String idPenumpang ; 
    private String idBusway ;
    private String idTransaksi ;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi,String Tanggal, String idPenumpang, String idBusway) {
        this.idTransaksi = idTransaksi ;
        this.Tanggal = Tanggal;
        this.idPenumpang = idPenumpang;
        this.idBusway = idBusway;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public String getIdBusway() {
        return idBusway;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setIdPenumpang(String idPenumpang) {
        this.idPenumpang = idPenumpang;
    }

    public void setIdBusway(String idBusway) {
        this.idBusway = idBusway;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
        public void SimpanTransaksi(){
        Koneksi kon = new Koneksi();
        String s = "insert into transaksi values('"+this.idTransaksi+"','"+this.Tanggal+"','"+this.idPenumpang+"','"+this.idBusway+"')";
        kon.query(s);
    }
    public void hapusTransaksi(){
      Koneksi kon = new Koneksi();
         String s = "delete from transaksi where idTransaksi='"+idTransaksi+"'";
       kon.query(s);
    }
}
