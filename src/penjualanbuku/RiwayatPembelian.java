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

public class RiwayatPembelian extends Pemesanan{
    String namaPembeli;
    String namaBuku;
    long no_telp; 
    int jumlah_buku; 
    String alamat; 
    String tanggalPembelian;

    RiwayatPembelian(){

    }
    
    public RiwayatPembelian(String namaPembeli, String namaBuku,long no_telp, int jumlah_buku, String alamat, String tanggalPembelian){
        this.namaPembeli = namaPembeli;
        this.namaBuku = namaBuku;
        this.no_telp = no_telp;
        this.jumlah_buku = jumlah_buku;
        this.alamat = alamat;
        this.tanggalPembelian = tanggalPembelian;
    }
    ArrayList<RiwayatPembelian> riwayatPembelian = new ArrayList<>();

    
    public void riwayatPembelian(String namaPembeli){
        int i = 0;
        System.out.println("History Pembelian");
        for(RiwayatPembelian riwayatPembelian : riwayatPembelian){
            if(riwayatPembelian.namaPembeli.equals(namaPembeli)){
                System.out.println((i+1)+ ". Nama Pembeli :" +riwayatPembelian.namaPembeli+"\nNama Buku: " +riwayatPembelian.namaBuku+"\nNomor Telepon: "+riwayatPembelian.no_telp+"\nJumlah Buku: "+riwayatPembelian.jumlah_buku+"\nAlamat: "+riwayatPembelian.alamat+"\nTanggal Pembelian: "+riwayatPembelian.tanggalPembelian);
                i++;
            }
        }
        if(i == 0){
            System.out.println("Anda Belum memiliki Riwayat Pembelian");
    }
   }

//    public void show(){
//        System.out.println("No"+"\t\tNama Buku"+"\t\tNo Telp"+"\t\tJumlah Buku"+"\t\tAlamat"+"\t\tStatus"+"Tanggal Pembelian");
//        for(RiwayatPembelian riwayatPembelian : riwayatPembelian){
//            System.out.println(riwayatPembelian+1+"\t\t"+riwayatPembelian.nama+"\t\t"+pemesanan.get(i).no_telp+"\t\t"+pemesanan.get(i).jumlah_buku+"\t\t"+pemesanan.get(i).alamat+"\t\t"+pemesanan.get(i).status+"\t\t");
//        }
//    }


}
