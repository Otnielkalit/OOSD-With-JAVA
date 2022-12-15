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
public class Komentar  {
    String nama, komen;
    ArrayList<Komentar> komentar = new ArrayList();
    public Komentar() {
    }

    public Komentar(String  komen, String nama) {
        this.nama = nama;
        this.komen = komen;
    }
    public void addKomentar(String  komen, String nama){

        komentar.add(new Komentar(nama, komen));
    }

    public class shows extends show{

        public shows() {
        }
        @Override
        public void tampil() {
            int num = 0;
//            System.out.println("No"+"\tNama"+"\t Komentar");
            for(int i=0;i<komentar.size();i++){
                System.out.println(i+1+"\t"+komentar.get(i).nama+"\t"+komentar.get(i).komen);

                num++;
                System.out.println("Nama        :"+komentar.get(i).nama);
                System.out.println("Komentar    :"+komentar.get(i).komen);
            }
        }
    }
}

