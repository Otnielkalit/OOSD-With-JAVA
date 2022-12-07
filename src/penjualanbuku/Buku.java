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
public class Buku {
    
       
    String nama;
    int jumlah_buku;
    int harga;
    String tipe;
    TipeBuku tipeBuku;
    String alamat;
    
    
    ArrayList<Buku> buku = new ArrayList();

    public Buku(String nama, int jumlah_buku, int harga, String tipe, String alamat) {
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
        this.harga = harga;
        this.tipe = tipe;
        this.alamat = alamat;
    }

    public Buku(String nama, int jumlah_buku, int harga, TipeBuku tipeBuku, String alamat) {
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
        this.harga = harga;
        this.tipeBuku = tipeBuku;
        this.alamat = alamat;
    }
    public Buku() {
    }
    
    
     public void tampilBuku(){
        System.out.println("No" +"\tNama" + "\t\t      Jumlah Buku"+              "\tHarga"+"         \tTipe"+"     \tPenerbit");
        for(int i=0;i<buku.size();i++){
            if(buku.get(i).jumlah_buku < 0){
                System.out.println("Sisa Buku");
                buku.remove(i);
                break;
            }
            System.out.println(i+1+". "+"\t"+buku.get(i).nama
                    +"\t\t"+ buku.get(i).jumlah_buku
                    +"\t\t"+ buku.get(i).harga
                    +"\t\t"+ buku.get(i).tipeBuku
                    +"\t"+ buku.get(i).alamat
            );
        }
    }
    
//    public void addHomestay(String nama,int jumlah_kamar, int harga, String tipe, String alamat){
//        homestay.add(new Homestay(nama, jumlah_kamar, harga, tipe, alamat));
//    }
//    
//    public void deleteHomestay(int opsi){
//        for(int i=0;i<homestay.size();i++){
//            if(opsi==i){
//                homestay.remove(i);
//            }
//        }
//    }
//    
//    public void updateHomestay(String nama,int jumlah_kamar, int harga, String tipe, String alamat, int opsi){
//        homestay.set(opsi, new Homestay(nama, jumlah_kamar, harga, tipe, alamat));
//    }
//    
    
    

    void addBuku(String nama, int jumlah_buku, int harga, TipeBuku tipeBuku, String alamat) {
        buku.add(new Buku(nama, jumlah_buku, harga, tipeBuku , alamat));
    }
    
     public void updateBuku(String nama,int jumlah_buku, int harga,  TipeBuku tipeBuku, String alamat, int opsi){
        buku.set(opsi, new Buku(nama, jumlah_buku, harga, tipeBuku.PELAJARAN, alamat));
    }
     
    public void deleteHomestay(int opsi){
        for(int i=0;i<buku.size();i++){
            if(opsi==i){
                buku.remove(i);
            }
        }
    }
    
    
}