/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

import java.util.ArrayList;
/**
 *
 * @author otnie
 */
public class Pemesanan {
    
    int jumlah_buku;
    String nama;
    long no_telp;
    String status;
    String alamat;
    
    ArrayList<Pemesanan> pemesanan = new ArrayList();

    public Pemesanan() {
        
    }

    public Pemesanan(int jumlah_buku, String nama, long no_telp) {
        this.jumlah_buku = jumlah_buku;
        this.nama = nama;
        this.no_telp = no_telp;
    }

    public Pemesanan(int jumlah_buku, String nama, long no_telp, String status) {
        this.jumlah_buku = jumlah_buku;
        this.nama = nama;
        this.no_telp = no_telp;
        this.status = status;
    }

    public Pemesanan(int jumlah_buku, String nama, long no_telp, String alamat, String status) {
        this.jumlah_buku = jumlah_buku;
        this.nama = nama;
        this.no_telp = no_telp;
        this.alamat = alamat;
        this.status = status;
    }
    
    public void show(){
        System.out.println("No"+"\t\tNama Buku"+"\t\tNo Telp"+"\t\tJumlah Buku"+"\t\tAlamat"+"\t\tStatus");
        for(int i = 0;i<pemesanan.size();i++){
            System.out.println(i+1+"\t\t"+pemesanan.get(i).nama+"\t\t"+pemesanan.get(i).no_telp+"\t\t"+pemesanan.get(i).jumlah_buku+"\t\t"+pemesanan.get(i).alamat+"\t\t"+pemesanan.get(i).status);
        }
    }
    public void pesanBuku(int jumlah_buku, String nama, long no_telp,String alamat,String status){
        pemesanan.add(new Pemesanan(jumlah_buku, nama, no_telp,alamat, status));
    }
    
    public void updateBuku(int ops,int jumlah_buku, String nama,String alamat, long no_telp,String status){
        for(int i = 0;i<pemesanan.size();i++){
             if(ops == i){
                 pemesanan.set(i,new Pemesanan(jumlah_buku, nama, no_telp, alamat, status));
             }
         }
    }
    public void hapusPemesanan(int opsi){
        for(int i =0;i<pemesanan.size();i++){
            if(opsi == i){
                pemesanan.remove(i);
            }
        }
    }
}