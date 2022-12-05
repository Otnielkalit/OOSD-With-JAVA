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
public class Penjualan {
    
    String nama;
    int stok;
    int harga;
    
    
    ArrayList<Penjualan> penjualan = new ArrayList();

    public Penjualan(String nama, int stok, int harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public Penjualan() {
    }
    
    
    
    
    
    
    
     public void tampilPenjualan(){
        System.out.println("No" +"\tNama Buku" + "\tStok"+"\tHarga");
        for(int i=0;i<penjualan.size();i++){
            System.out.println(i+1+". "
                    +"\t"+ penjualan.get(i).nama
                    +"\t"+ penjualan.get(i).stok
                    +"\t"+ penjualan.get(i).harga
                    
            );
        }
    }
    
    public void addPenjualan(String nama,int stok, int harga){
        penjualan.add(new Penjualan(nama, stok, harga));
    }
    
    public void deletePenjualan(int opsi){
        for(int i=0;i<penjualan.size();i++){
            if(opsi==i){
                penjualan.remove(i);
            }
        }
    }
    
    public void updatePenjualan(String nama,int stok, int harga, int opsi){
        penjualan.set(opsi, new Penjualan(nama, stok, harga));
    }
    
    
    
}