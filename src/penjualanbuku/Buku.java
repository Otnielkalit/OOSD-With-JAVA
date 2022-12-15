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
    String penerbit;
    
    
    ArrayList<Buku> buku = new ArrayList();

    public Buku(String nama, int jumlah_buku, int harga, String tipe, String penerbit) {
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
        this.harga = harga;
        this.tipe = tipe;
        this.penerbit = penerbit;
    }

    public Buku(String nama, int jumlah_buku, int harga, TipeBuku tipeBuku, String penerbit) {
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
        this.harga = harga;
        this.tipeBuku = tipeBuku;
        this.penerbit = penerbit;
    }
    public Buku() {
    }
    
    
     public void tampilBuku(){
        int num = 0;
//        System.out.println("No" +"\tNama" + "\t\t      Stok Buku"+              "\tHarga"+"         \tTipe"+"     \tPenerbit");
        for(int i=0;i<buku.size();i++){
            if(buku.get(i).jumlah_buku < 0){
                System.out.println("Sisa Buku");
                buku.remove(i);
                break;
            }
            System.out.println(i+1);
            System.out.println("Nama Buku   :"+buku.get(i).nama);
            System.out.println("Stok Buku   :"+buku.get(i).jumlah_buku);
            System.out.println("Harga Buku  :"+buku.get(i).harga);
            System.out.println("Tipe Buku   :"+buku.get(i).tipeBuku);
            System.out.println("Penerbit    :"+buku.get(i).penerbit);
//            System.out.println(i+1+". "+"\t"+buku.get(i).nama
//                    +"\t\t"+ buku.get(i).jumlah_buku
//                    +"\t\t"+ buku.get(i).harga
//                    +"\t\t"+ buku.get(i).tipeBuku
//                    +"\t"+ buku.get(i).penerbit
//            );
        }
    }
    

    
    

    void addBuku(String nama, int jumlah_buku, int harga, TipeBuku tipeBuku, String alamat) {
        buku.add(new Buku(nama, jumlah_buku, harga, tipeBuku , alamat));
    }
    
     public void updateBuku(String nama,int jumlah_buku, int harga,  TipeBuku tipeBuku, String penerbit, int opsi){
        buku.set(opsi, new Buku(nama, jumlah_buku, harga, tipeBuku.PELAJARAN, penerbit));
    }
     
    public void deleteBuku(int opsi){
        for(int i=0;i<buku.size();i++){
            if(opsi==i){
                buku.remove(i);
            }
        }
    }
    
    
}