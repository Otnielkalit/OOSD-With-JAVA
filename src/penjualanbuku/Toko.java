/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

import java.util.Scanner;
/**
 *
 * @author otnie
 */
public class Toko implements Display{
    String namaToko, alamat, pemilik, karyawan, email, no_telp;


    public Toko(){}
    
    public Toko(String namaToko,String alamat, String pemilik, String karyawan, String email, String no_telp) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.karyawan = karyawan;
        this.email = email;
        this.no_telp = no_telp;
        
    }
    public void setToko(String namaToko, String alamat, String pemilik, String karyawan, String email, String no_telp) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.karyawan = karyawan;
        this.email = email;
        this.no_telp = no_telp;
        
    }
    //Profil TokoJaya
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setKades(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(String karyawan) {
        this.karyawan = karyawan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }
    
        public String getNoTelp() {
        return no_telp;
    }

    public void setNoTelp(String no_telp) {
        this.no_telp = no_telp;
    }
    

    @Override
    public void display() {
        System.out.println("\nNama Toko : "+getNamaToko()+"\nAlamat Toko : "+getAlamat()+"\nPemilik Toko : "+getPemilik()+"\nKaryawan Toko : "+getKaryawan()+"\nEmail : "+getEmail()+"\nNo Telepon : "+getNoTelp());
    }
    
    public void editToko(){
        System.out.println("\t|| ======== Edit Profil Toko ======= ||");
        Scanner scan =  new Scanner(System.in).useDelimiter("\n");
        System.out.print("Nama Toko : ");
        namaToko = scan.next();
        System.out.print("Alamat Toko : ");
        alamat = scan.next();
        System.out.print("Pemilik Toko : ");
        pemilik = scan.next();
        System.out.print("Karyawan Toko : ");
        karyawan = scan.next();
        System.out.print("Email : ");
        email = scan.next();
        System.out.print("No Telepon : ");
        no_telp = scan.nextLine();
    }
    
    //Peraturan Desa
    
}
