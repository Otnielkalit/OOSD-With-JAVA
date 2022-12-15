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
    String alasan_pengembalian, namaAnda, namaBuku;
    ArrayList <PengembalianBuku> form = new ArrayList();
    public PengembalianBuku() {
    
    }

    public PengembalianBuku(String alasan_pengembalian, String namaAnda, String namaBuku) {
        this.alasan_pengembalian = alasan_pengembalian;
        this.namaAnda = namaAnda;
        this.namaBuku = namaBuku;
    }
    
    public void tampil(){
        int num = 0;
//        System.out.println("No"+"\t\t\tNama Customer\tNama Buku\tAlasan Pengembalian");
        for(int i=0;i<form.size();i++){
            System.out.println(i+1+"\t"+form.get(i).alasan_pengembalian+"\t"+form.get(i).namaAnda);

            num ++;
            System.out.println("Nomor"+num);
            System.out.println("Nama CUstomer :"+form.get(i).namaAnda);
            System.out.println("Nama CUstomer :"+form.get(i).namaBuku);
            System.out.println("Nama CUstomer :"+form.get(i).alasan_pengembalian);
        }
    }
    
    public void addPermohonan(String alasan_pengembalian, String namaAnda, String namaBuku){
        form.add(new PengembalianBuku(alasan_pengembalian,namaAnda, namaBuku));
    }
    
}
