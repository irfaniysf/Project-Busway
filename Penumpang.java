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
public class Penumpang {
    private String idPenumpang ;
    private String username ;
    private String password ; 
    private String alamat ;
    private String no_hp ; 
    private String saldo ;


    public Penumpang() {
    }

    
    public Penumpang(String idPenumpang, String username, String password, String alamat, String no_hp, String saldo) {
        this.idPenumpang = idPenumpang;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.saldo = saldo;
    }

    public void setIdPenumpang(String idPenumpang) {
        this.idPenumpang = idPenumpang;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getSaldo() {
        return saldo;
    }
    public void SimpanPenumpang(){
        Koneksi kon = new Koneksi();
        String s = "insert into penumpang values('"+this.idPenumpang+"','"+this.username+"','"+this.password+"','"+this.alamat+"','"+this.no_hp+"','"+this.saldo+"')";
        kon.query(s);
    }
    public void hapusPenumpang(){
      Koneksi kon = new Koneksi();
       String s = "delete from penumpang where idPenumpang='"+idPenumpang+"'";
       kon.query(s);
    }
    public void updatePenumpang (){
        Koneksi konn = new Koneksi();
        String s = "update penumpang set saldo = ' " + this.saldo + "' where idPenumpang = '" + this.idPenumpang + "'";
        konn.query(s);
    }
    
}
