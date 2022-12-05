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
public class PengembalianBuku {
    String alasan_pengembalian, namaBuku;
    ArrayList <PengembalianBuku> form = new ArrayList();
    public PengembalianBuku() {
    
    }

    public PengembalianBuku(String alasan_pengembalian, String namaBuku) {
        this.alasan_pengembalian = alasan_pengembalian;
        this.namaBuku = namaBuku;
    }
    
    public void tampil(){
        System.out.println("No"+"\t\tHal+\t\tAtas Nama");
        for(int i=0;i<form.size();i++){
            System.out.println(i+1+"\t"+form.get(i).alasan_pengembalian+"\t"+form.get(i).namaBuku);
        }
    }
    
    public void addPermohonan(String permohonan, String orang){
        form.add(new PengembalianBuku(alasan_pengembalian,namaBuku));
    }
    
}
