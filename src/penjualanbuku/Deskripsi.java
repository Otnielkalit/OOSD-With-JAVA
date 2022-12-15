/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

/**
 *
 * @author otnie
 */
public class Deskripsi{
    String description, detailProduk, packing;

    public Deskripsi() {
    }

    public Deskripsi(String description, String detailProduk, String packing) {
        this.description = description;
        this.detailProduk = detailProduk;
        this.packing = packing;
    }

    
    
//    public void setDeskripsi(String description, String detailProduk, String packing){
//        this.description = description;
//        this.detailProduk = detailProduk;
//        this.packing = packing;
//    }

    public String getDetailProduk() {
        return this.detailProduk;
    }

    public void setDetailProduk(String detailProduk) {
        this.detailProduk = detailProduk;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPacking() {
        return this.packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }
    
    public void display() {

        System.out.println("Detail Buku     :"+detailProduk);
        System.out.println("Deskripsi Buku  :"+description);
        System.out.println("Sistem Packing  :"+packing);
        System.out.println("|| ========================================= ||");
    }

    void setDeskripsi(String description, String detailProduk, String packing) {
        this.description = description;
        this.detailProduk = detailProduk;
        this.packing = packing;
    }
    
    
}