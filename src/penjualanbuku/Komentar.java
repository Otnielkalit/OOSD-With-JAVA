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
    String komen;
    ArrayList<Komentar> komentar = new ArrayList();
    public Komentar() {
    }

    public Komentar(String komen) {
        this.komen = komen;
    }
    public void addKomentar(String komen){
        komentar.add(new Komentar(komen));
    }

    public class shows extends show{

        public shows() {
        }
        @Override
        public void tampil() {
            System.out.println("No"+"\t Komentar");
            for(int i=0;i<komentar.size();i++){
                System.out.println(i+1+"\t"+komentar.get(i).komen);
            }
        }
    }
}

